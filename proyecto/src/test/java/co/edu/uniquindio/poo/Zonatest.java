package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class Zonatest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test 
    public void ValorZonaRectangularGramaSintetica (){
        LOG.info("Inicio test valor zona rectangular con material grama sintetica");
        Zona zona = new Zona("Z1", Material.GRAMA_SINTENTICA, new Rectangulo(10, 20));
        assertEquals(7000000.0, zona.calcularValor(), App.PRECISION);
        LOG.info("Inicio test valor zona rectangular con material grama sintetica");
    }

    @Test
    public void ValorZonaCircularArena (){
        LOG.info("Inicio test valor zona circular con material arena");
        Zona zona = new Zona("Zona 1", Material.ARENA, new Circulo(10) );
        assertEquals(3141592.65, zona.calcularValor(),0.05, App.PRECISION);
        LOG.info("Fin test valor zona circular con material arena");
    }
}
