/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio test datos completos");
        Mascota mascota = new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2);
        assertEquals("Paloma", mascota.getNombre());
        assertEquals("Canino", mascota.getEspecie());
        assertEquals("Golden Retriever", mascota.getRaza());
        assertEquals(9, mascota.getEdad());
        assertEquals("Hembra", mascota.getGenero());
        assertEquals("Negro", mascota.getColor());
        assertEquals((float) 30.1, mascota.getPeso ());

        LOG.info("Finalización test datos completos");
    }

    @Test
    public void datosIguales() {
        LOG.info("Inicio test datos iguales");
        Mascota mascota1 = new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2);
        Mascota mascota2 = new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2);
        assertNotEquals(mascota1.getNombre(), mascota2.getNombre());
        assertNotEquals(mascota1.getEspecie(), mascota2.getEspecie());
        assertNotEquals(mascota1.getRaza(), mascota2.getRaza());
        assertNotEquals(mascota1.getEdad(), mascota2.getEdad());
        assertNotEquals(mascota1.getGenero(), mascota2.getGenero());
        assertNotEquals(mascota1.getColor(), mascota2.getColor());
        assertNotEquals(mascota1.getPeso(), mascota2.getPeso());
        
        LOG.info("Finalización test datos iguales");
        
    }

    @Test 
    public void datosNulos(){
        LOG.info ("Inicio test datos nulos");
        assertThrows(Throwable.class, () -> new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2));
    
        LOG.info("Finalización test datos nulos");

    }

    @Test 
    public void datosVacios(){
        LOG.info("Inicio prueba datos vacios");
        assertThrows(Throwable.class, () -> new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2));

        LOG.info("Finalización test datos vacios");

    }

    @Test
    public void limiteEdad(){
        LOG.info("Inicio prueba limite edad");
        assertDoesNotThrow(() -> new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2));

        LOG.info("Finalización prueba limite edad");
    }
}
