/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2024-04
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class FiguraTest {
    private static final Logger LOG = Logger.getLogger(FiguraTest.class.getName());

    /**
     * @Test datos nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class, () -> new Rectangulo(0, 0));
        assertThrows(Throwable.class, () -> new ZonaFigura(null));
        LOG.info("Fin prueba datos nulos");
    }
    /*
     * @Test obtener datos completos de una figura
     */
    @Test
    public void datosCompletos (){
        LOG.info("Inicio prueba datos completos");
        ZonaFigura zona = new ZonaFigura("La pradera");
        var cuadrado = new Cuadrado(5, 2);
        var triangulo = new Triangulo(3, 1);
        
        zona.añadirFigura(cuadrado);
        zona.añadirFigura(triangulo);

        assertEquals(5, cuadrado.getAlto());
        LOG.info("Fin prueba datos completos");
    }

    /*
     * @Test para imprimir en consola el area de una figura
     */
    @Test 
    public void calcularAreaCuadrado (){
        LOG.info("Inicio prueba area de una figura");
        var cuadrado = new Cuadrado(3, 2);
        assertEquals(6, cuadrado.calcularArea());
        System.out.println(cuadrado.calcularArea());
        LOG.info("Fin prueba area de una figura");
    }

    /*
     * @Test para obtener una lista de figuras ordenadas por area 
     */
    @Test
    public void listaOrdenada (){
        LOG.info("Inicio prueba lista de figuras ordenadas");
        var zonaFigura = new ZonaFigura("La floresta");
        var rectangulo = new Rectangulo(3, 1);
        var triangulo = new Triangulo(6, 2);
        var cuadrado = new Cuadrado(1, 4);

        zonaFigura.añadirFigura(rectangulo);
        zonaFigura.añadirFigura(triangulo);
        zonaFigura.añadirFigura(cuadrado);
        
        Collection<Figura> listaEsperada = List.of(triangulo, cuadrado, rectangulo);
        assertIterableEquals(listaEsperada, zonaFigura.FigurasOrdenadas(zonaFigura.getListaFiguras()));
        LOG.info("Fin prueba lista de figuras ordenadas");
    }

    /**
     * @Test lista de datos nulos
     */
    @Test
    public void listaDatosNulos(){
        LOG.info("Inicio test listaDatosNulos");
        assertThrows(Throwable.class,()-> new ZonaFigura(null).FigurasOrdenadas(null));
        LOG.info("Fin test listaDatosNulos");
    }

    /*
     * @Test lista de datos vacios
     */
    @Test
    public void listaDatosVacios (){
        LOG.info("Inicio prueba lista datos vacios");
        Collection<Figura> lista = new LinkedList<>();
        assertThrows(Throwable.class, ()->  new ZonaFigura("").FigurasOrdenadas(lista));
        LOG.info("Fin prueba lista datos vacios");
    }
}