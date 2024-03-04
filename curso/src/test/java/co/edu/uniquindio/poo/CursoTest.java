package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CursoTest {
    

    @Test
    public void datosCompletos (){
        Curso curso = new Curso ("Programacion 1");

        assertEquals("Programacion 1", curso.getNombre());
    }

    @Test
    public void registrarEstudiante (){
        Curso curso = new Curso("Programacion 1");
         Estudiante estudiante = new Estudiante("Val", "Rodriguez", "1111111", "@", "sjdo", 1);
        
         curso.registrarEstudiante (estudiante);

        assertTrue(curso.getListaEstudiantes().contains(estudiante));
        assertEquals(1, curso.getListaEstudiantes().size());

    }

    @Test
    public void datosNulos (){
        assertThrows(Throwable.class,() -> new Curso(null));
    }

    @Test 
    public void agregarEstudianteRepetido (){
        Curso curso = new Curso("Programación I");
        Estudiante estudiante1 = new Estudiante("Camila", "Alzate Rios", "109453264", "@", "3122231321", 18);
        Estudiante estudiante2 = new Estudiante("Valentina", "Rodriguez", "1016833647", "@1", "7164384629", 19);
    
    curso.registrarEstudiante(estudiante1);

    assertThrows(Throwable.class, () -> curso.registrarEstudiante(estudiante2));
    }
}
