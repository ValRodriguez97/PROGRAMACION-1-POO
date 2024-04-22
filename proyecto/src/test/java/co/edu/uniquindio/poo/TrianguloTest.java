package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TrianguloTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test
    public void AreaTrianguloPositiva (){
        LOG.info("Inicio test calcular el area de un triangulo con valores positivos");
        Triangulo triangulo1 = new Triangulo(2, 5);
        assertEquals(5, triangulo1.calcularArea());
        LOG.info("Fin test calcular el area de un triangulo con valores positivos");
    }

    @Test
    public void AreaTrianguloBaseNegativa (){
        LOG.info("Inicio test calcular el area de un triangulo cuando el valor de su base es negativo");
        assertThrows(Throwable.class, () -> new Triangulo(-2, 16));
        LOG.info("Inicio test calcular el area de un triangulo cuando el valor de su base es negativo");
    }

    @Test
    public void AreaTrianguloAlturaNegativa (){
        LOG.info("Inicio test calcular el area de un triangulo cuando el valor de su altura es negativo");
        assertThrows(Throwable.class, () -> new Triangulo(3, -30));
        LOG.info("Fin test calcular el area de un triangulo cuando el valor de su altura es negativo");
    }  

}
