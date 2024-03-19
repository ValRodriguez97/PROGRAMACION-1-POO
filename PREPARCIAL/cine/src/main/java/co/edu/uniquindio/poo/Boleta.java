package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public record Boleta(LocalDate fecha, LocalTime hora, String nombre, int valor) { //Atributos de la clase

public Boleta {
    assert fecha != null;
    assert hora != null;
    assert nombre != null;
    assert valor > 5000;

    }
}
