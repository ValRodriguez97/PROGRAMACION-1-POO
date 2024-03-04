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
        assertEquals("Paloma", mascota.nombre());
        assertEquals("Canino", mascota.especie());
        assertEquals("Golden Retriever", mascota.raza());
        assertEquals(9, mascota.edad());
        assertEquals("Hembra", mascota.genero());
        assertEquals("Negro", mascota.color());
        assertEquals((float) 30.1, mascota.peso ());

        LOG.info("Finalización test datos completos");
    }

    @Test
    public void datosIguales() {
        LOG.info("Inicio test datos iguales");
        Mascota mascota1 = new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2);
        Mascota mascota2 = new Mascota("123", "pepe", "Felino", "Mestizo", (byte)10, "Macho", "Gris", (float)2);
        assertNotEquals(mascota1.nombre(), mascota2.nombre());
        assertNotEquals(mascota1.especie(), mascota2.especie());
        assertNotEquals(mascota1.raza(), mascota2.raza());
        assertNotEquals(mascota1.edad(), mascota2.edad());
        assertNotEquals(mascota1.genero(), mascota2.genero());
        assertNotEquals(mascota1.color(), mascota2.color());
        assertNotEquals(mascota1.peso(), mascota2.peso());
        
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
