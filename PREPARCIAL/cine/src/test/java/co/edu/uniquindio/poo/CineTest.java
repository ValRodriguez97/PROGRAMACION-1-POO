package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.Test;


public class CineTest {
    

    @Test
    public void datosCompletos (){ //Prueba datos completos de la clase cine

        Cine cine = new Cine("Cine Colombia"); // nueva instancia cine 

        assertEquals("Cine Colombia", cine.getNombre()); //se hace una comparacion con un objeto esperado y lo que se tiene actualmente
    }

    @Test 
    public void registrarBoleta (){ // prueba para registrar una boleta
        Cine cine = new Cine ("Cine Colombia"); // Se crea una nueva instancia cine
        Boleta boleta = new Boleta(LocalDate.of(2024, 03,13), LocalTime.of(9, 56), "Kimetsu no Yaiba", (int) 45000);
        cine.registrarBoleta(boleta);
        Boleta boleta2 = new Boleta(LocalDate.of(2024, 03, 13), LocalTime.of(9, 58), "Venom", (int) 30000); // se crean dos nuevas instancias boletas
        cine.registrarBoleta(boleta2); // se añaden esas variables a la lista en cine 

        assertTrue(cine.getlistaBoletas().contains(boleta) && cine.getlistaBoletas().contains(boleta2)); // es cierto que la lista contiene esas dos variables
        assertEquals(2, cine.getlistaBoletas().size()); // para saber si se registro la boleta se ejecuta assert equals y size para saber el tamaño de la lista, es decir cuantos elementos contiene
    }

    @Test
    public void datosNulos(){ // prueba de datos nulos para la clase cine
        
        assertThrows(Throwable.class,()-> new Cine(null));   // se crea una excepcion, el assert esta ubicado en la clase Cine
    }

    @Test
    public void agregarBoletaValorMenor (){ //Prueba para agregar a la lista una boleta con valor menor a 5000
        Cine cine = new Cine("Ruta Feliz"); // nueva instancia cine
        Boleta boleta = new Boleta(LocalDate.of(2024, 03, 13), LocalTime.of(10,04), "Ruta Feliz", 3000); //nueva instancia boleta
        assertThrows(Throwable.class,()-> cine.registrarBoleta(boleta));        
    }

    @Test 
    public void valoresMayores (){
        Cine cine = new Cine("Cine colombia");
        Boleta boleta = new Boleta(null, null, null, 1000);
        Boleta boleta2 = new Boleta(null, null, null, 3000);
        cine.registrarBoleta(boleta);
        cine.registrarBoleta(boleta2);

        Collection<Boleta> listaEsperada = List.of(boleta2);

        assertIterableEquals(listaEsperada, cine.getListadoMenoresEdad());
    }
}