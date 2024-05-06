package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BancoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void realizarDeposito (){
        LOG.info("Inicio test realizar deposito");
        var banco = new Banco("BBVA");
        var cuenta = new CuentaAhorros(new Titular("Valentina", "Rodriguez"), 819280, 
        100000, true, 0.5);
        banco.añadirCuentasBancarias(cuenta);
        cuenta.retirarDinero(10000);
        assertEquals(95000, cuenta.getSaldo());
        System.out.println(cuenta.getSaldo());
        cuenta.depositarDinero(100000);
        assertEquals(195000, cuenta.getSaldo());
        
    }

    @Test 
    public void transferirDinero (){
        LOG.info("Inicio test transferir dinero");
        var banco = new Banco("Davivienda");
        var cuenta = new CuentaCorriente(new Titular("a", "b"), 1001000200,1000000, true, 50000);
        var cuenta2 = new CuentaCorriente(new Titular("a", "b"), 2002000100, 40000, false, 50000);
        banco.añadirCuentasBancarias(cuenta);
        banco.añadirCuentasBancarias(cuenta2);

        var transacción = new Transaccion("9182", 40000, LocalDate.of(2024, 05, 02), "a", true, TipoTransaccion.DEPOSITO);
        cuenta.añadirTransaccion(transacción);
        transacción.transferirDinero(cuenta, cuenta2);
        cuenta.mostrarEstadoTransacciones();
        
         

    }
    //singleton permite crear metodos de un unico uso
    //un sistema debe de estar altamente cohesionado y debe estar bajo (acoplamiento)
    //cohesion - cuando se elimine un elemento no afecte el comportamiendo de un sistema
    //acoplar - muchas dependencias con otras cosas 
    /* 
     * interfaaz grafica
     * grafical user interface
     * grafical-toda la parte visual
     * layout como se distribuyen los componentes en un espacio
     * user - 
     * interfaz grafica de usuario - contrato, publico (debe de ser publica), servicios(publicos)- se hace mediane uana interaccion. e interacción- 
     * 
    */
    

}
