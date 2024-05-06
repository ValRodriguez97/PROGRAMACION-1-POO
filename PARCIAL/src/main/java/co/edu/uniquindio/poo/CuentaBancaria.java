package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;



public abstract class CuentaBancaria {
    private int numeroCuenta;
    public double saldo;
    public boolean estadoCuenta;
    private Titular titular;
    private final Collection<Transaccion> transacciones;
    
    /*
     * Método Constructor de la clase Cuenta Bancaria
     */
    public CuentaBancaria (Titular titular,int numeroCuenta, double saldo, boolean estadoCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;
        this.transacciones = new LinkedList<>();
    }

    /*
     * Método para obtener al titular de una cuenta bancaria 
     * @return titular
     */
    public Titular geTitular(){
        return titular;
    }

    /*
     * Método para obtener el numero de una cuenta bancaria
     * @return numero cuenta
     */
    public int getNumeroCuenta (){
        return numeroCuenta;
    }

    /*
     * Método para obtener el saldo de una cuenta bancaria
     * @return saldo
     */
    public double getSaldo(){
        return saldo;
    }

    /*
     * Método para obtener el estado de una cuenta
     * @return estado cuenta
     */
    public boolean estadoCuenta (){
        return estadoCuenta;
    }

    /*
     * Método para obtener la colección no modificable de transacciones
     * @return lista no modificable
     */
    public Collection<Transaccion> gettransaccioneses (){
        return Collections.unmodifiableCollection(transacciones);
    }

    /*
     * Método para añadir una transaccion a la lista de transacciones 
     */
    public void añadirTransaccion (Transaccion transaccion){
        transacciones.add(transaccion);
    }

    /*
     * Método para depositar dinero en una cuenta bancaria
     */
    public void depositarDinero (double dinero){
        assert dinero > 0;
         saldo += dinero;
            if (saldo == 0){
            estadoCuenta = false;
            }
        }
    
    /*
     * Método abstracto para retirar dinero de una cuenta bancaria
     */
    public abstract void retirarDinero(double dinero);

    /*
     * Método para transferir dinero
     */
    public  void mostrarEstadoTransacciones() {
        System.out.println("Estado transacciones de la cuenta " + numeroCuenta + ":");
            for (Transaccion transaccion : transacciones) {
                System.out.println("Codigo de la transaccion: " + transaccion.getCodigo());
                System.out.println("Valor de la transaccion: " + transaccion.getValor());
                System.out.println("Fecha de la transaccioon: " + transaccion.getFecha());
                System.out.println("Descripcion de la transaccion: " + transaccion.getDescripcion());
                System.out.println("Estado de la transaccion: " + transaccion.getEstadoTransaccion());
                System.out.println("Tipo de transaccion: " + transaccion.getTipoTransaccion());
                System.out.println("-----------------------");
            }
    }
}


