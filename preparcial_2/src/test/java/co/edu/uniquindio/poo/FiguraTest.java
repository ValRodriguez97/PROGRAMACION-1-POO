/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
        LOG.info("Fin prueba datos nulos");
    }
    /*
     * Prueba datos completos
     */
    @Test
    public void datosCompletos (){
        LOG.info("Inicio prueba datos completos");
        var zona = new ZonaFigura("La pradera");
        var cuadrado = new Cuadrado(0, 0);

      
    }

    @Test 
    public void calcularAreaCuadrado (){
        var cuadrado = new Cuadrado(3, 2);
        assertEquals(6, cuadrado.calcularArea());

    }

}
