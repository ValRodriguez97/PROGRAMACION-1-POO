package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test
    public void AreaPositivaRectangulo(){
        LOG.info("Inicio test area positiva de un rectangulo");

        Rectangulo rectangulo = new Rectangulo(3, 2);

        assertEquals(6, rectangulo.calcularArea());

        LOG.info("Fin test area positiva de un rectangulo");
    }

    @Test
    public void AreaAnchoNegativo (){
        LOG.info("Inicio prueba calcular area de un rectangulo cuando su ancho es negativo");
        assertThrows(Throwable.class,() -> new Rectangulo(-2, 2));
        LOG.info("Fin prueba calcular area de un rectangulo cuando su ancho es negativo");
    }

    @Test
    public void AreaAltoNegativo (){
        LOG.info("Inicio prueba calcular area de un rectangulo cuando el alto es negativo");
        assertThrows(Throwable.class, () -> new Rectangulo(2, -7));
        LOG.info("Fin prueba calcular area de un rectangulo cuando el alto es negativo");
    }
}
