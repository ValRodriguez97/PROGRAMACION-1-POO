package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test
    public void areaCuadradoPositivo (){
        LOG.info("Inicio test calcular el area de un cuadrado con valores positivos");
        Cuadrado cuadrado = new Cuadrado(2);
        assertEquals(4, cuadrado.calcularArea());
        LOG.info("Fin test calcular el area de un cuadrado con valores positivos");
    }

    @Test 
    public void areaCuadradoNegativa (){
        LOG.info("Inicio test calcular el area de un cuadrado con valores negativos");
        assertThrows(Throwable.class, () -> new Cuadrado(-6));
        LOG.info("Fin test calcular el area de un cuadrado con valores negativos");
    }
}
