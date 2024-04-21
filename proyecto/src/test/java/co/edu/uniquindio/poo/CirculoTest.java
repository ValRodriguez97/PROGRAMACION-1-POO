package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test
    public void AreaCirculoPositiva (){
        LOG.info("Inicio test calcular el area de un circulo cuando sus valores son positivos");
        Circulo circulo = new Circulo(10);
        assertEquals(314.159, circulo.calcularArea(),0.05);
        LOG.info("Fin test calcular el area de un circulo cuando sus valores son positivos");
    }

    @Test
    public void AreaCirculoNegativa (){
        LOG.info("Inicio teste calcular el area de un circulo cuando el radio es negativo");
        assertThrows(Throwable.class, ()-> new Circulo(-10));
        LOG.info("Inicio teste calcular el area de un circulo cuando el radio es negativo");
    }


}
