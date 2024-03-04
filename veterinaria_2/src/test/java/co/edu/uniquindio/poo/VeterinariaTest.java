package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Inicio prueba datos completos");

        Veterinaria veterinaria = new Veterinaria ("Amigos Peludos");

        assertEquals("Amigos Peludos", veterinaria.getNombre());

        LOG.info("Fin prueba datos completos");
    }

    @Test 
    public void agregarMascota() {
        LOG.info("Inicio prueba agregarMascota");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        Mascota mascota = new Mascota("1234", "Poseidon", "Felino", "Korat", (byte)2, "Macho", "Gris", (float) 6.4);
        veterinaria.agregarMascota(mascota);


        assertTrue(veterinaria.getlistaMascotas().contains(mascota));
        assertEquals(1, veterinaria.getlistaMascotas().size());

        LOG.info("Finalización prueba agregarMascota");
    }

    @Test 
    public void datosNulos (){
        LOG.info("Inicio prueba datosNulos");

        assertThrows(Throwable.class, () -> new Veterinaria(null));

        LOG.info("Finalización prueba datosNulos");
    }

    @Test 
    public void agregarMascotaRepetida (){
        LOG.info("Inicio prueba MascotaRepetida");

        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

        Mascota mascota1 = new Mascota("1234", "Poseidon", "Felino", "Korat", (byte) 2, "Macho", "Gris", (float)6.1);
        Mascota mascota2 = new Mascota("1234", "Paloma", "Canino", "Korat", (byte)9, "Hembra", "Negro", (float)30.2);
        veterinaria.agregarMascota(mascota1);

        assertThrows(Throwable.class, () -> veterinaria.agregarMascota(mascota2));

        LOG.info("Finalización prueba MascotaRepetida");
    }
}


