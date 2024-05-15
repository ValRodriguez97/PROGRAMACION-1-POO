/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import fiesta.model.Director;
import fiesta.model.Estudiante;
import fiesta.model.Fiesta;
import fiesta.model.IInvitado;
import fiesta.model.Invitado;
import fiesta.model.Profesor;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void invitado(){
        LOG.info("Inicio test interfaz invitado");
        var fiesta = new Fiesta("Fiesta");
        var invitado = new Invitado("Juan");
        var estudiante = new Estudiante();
        var director = new Director();
        var profesor = new Profesor();
        var colado = new IInvitado() { //clase anonima, cuando son pocos
            public void comer(){
                System.out.println("Colado comiendo");
            }
            public void tomar(){
                System.out.println("Colado tomando");
            }
            public void bailar(){
                System.out.println("Colado bailando");
            }
        };
        var colado2 = new IInvitado() {
            public void comer(){
                System.out.println("Colado2 comiendo");
            }
            public void tomar(){
                System.out.println("Colado2 tomando");
            }
            public void bailar(){
                System.out.println("Colado2 bailando");
            }
        };
        fiesta.ingresarFiesta(invitado);
        fiesta.ingresarFiesta(estudiante);
        fiesta.ingresarFiesta(director);
        fiesta.ingresarFiesta(colado);
        fiesta.ingresarFiesta(profesor);
        fiesta.ingresarFiesta(colado2);

        fiesta.bailarTodos();

        fiesta.salirDeLaFiesta(director);
        fiesta.salirDeLaFiesta(profesor);
        LOG.info("Fin test interfaz invitado");
    }
}
