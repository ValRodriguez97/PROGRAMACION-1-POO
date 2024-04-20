/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
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
     * Prueba con datos nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class, () -> new Rectangulo(0, 0));
        assertThrows(Throwable.class, () -> new ZonaFigura(null));
        LOG.info("Fin prueba datos nulos");
    }
    /*
     * Prueba datos completos
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
      
    }

    @Test 
    public void calcularAreaCuadrado (){
        var cuadrado = new Cuadrado(3, 2);
        assertEquals(6, cuadrado.calcularArea());
        System.out.println(cuadrado.calcularArea());
    }

    /*se
     * Metodo para obtener una nueva lista ordenada 
     */
    @Test
    public void listaOrdenada (){
        var zonaFigura = new ZonaFigura("La floresta");
        var rectangulo = new Rectangulo(3, 1);
        var triangulo = new Triangulo(6, 2);
        var cuadrado = new Cuadrado(2, 4);

        zonaFigura.añadirFigura(rectangulo);
        zonaFigura.añadirFigura(triangulo);
        zonaFigura.añadirFigura(cuadrado);
        
        Collection<Figura> listaEsperada = List.of(cuadrado, triangulo, rectangulo);
        assertIterableEquals(listaEsperada, zonaFigura.FigurasOrdenadas(zonaFigura.getListaFiguras()));
    }

    /**
     * 
     */
    @Test
    public void listaDatosNulos(){
        LOG.info("Inicio test listaDatosNulos");
        assertThrows(Throwable.class,()-> new ZonaFigura(null).FigurasOrdenadas(null));

        LOG.info("Fin test listaDatosNulos");
    }

    @Test
    public void listaDatosVacios (){
        Collection<Figura> lista = new LinkedList<>();
        assertThrows(Throwable.class, ()->  new ZonaFigura("").FigurasOrdenadas(lista));
    }
}