package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class BoletaTest {
    @Test
    public void datosNulos (){
       
        assertThrows(Throwable.class, () -> new Boleta(null, null, null, 0));
    }

    @Test
    public void datosCompletos(){
        Boleta boleta = new Boleta(LocalDate.of(2024, 03, 13), LocalTime.of( 11, 19), "Ruta feliz", 3000);

        assertEquals(LocalDate.of(2024, 03, 13), boleta.fecha());
    }
}
