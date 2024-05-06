package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Banco {
    private final String nombre;
    private Collection<CuentaBancaria> cuentas;
    private Collection<Titular> titulares;

    /*
     * Método constructor de la clase Banco
     */
    public Banco (String nombre){
        this.nombre = nombre;
        assert nombre != null && !nombre.isBlank() : "Error, el nombre debe ser diferente de null y no puede estar vacio";
        this.cuentas= new LinkedList<>();
        this.titulares = new LinkedList<>();
    }

    /*
     * Método para obtener el nombre de un banco
     * @return nombre banco
     */
    public String getNombre (){
        return nombre;
    }

    /*
     * Método para obtener la colección no modificaable de cuentas bancarias
     * @return colección no modificable
     */
    public Collection<CuentaBancaria> getCuentas(){
        return Collections.unmodifiableCollection(cuentas);
    }

    /*
     * Método para obtener la colección no modificable de los titulares de una cuenta
     * @return colección no modificable
     */
    public Collection<Titular> getTitulares (){
        return Collections.unmodifiableCollection(titulares);
    }

    /*
     * Método para añadir una cuenta bancaria a la colección de cuentas bancarias
     * La cuenta debe de ser diferente a una cuenta ya redistrada
     */
    public void añadirCuentasBancarias (CuentaBancaria cuentaBancaria){
        assert !cuentasExistentes (/*cuentas,*/ cuentaBancaria.getNumeroCuenta()) : "La cuenta ya existe";
        cuentas.add(cuentaBancaria);
    }

    /*
     * Método para añadir un titular a la colección de titulares
     */
    public void añadirTitulares (Titular titular){
        titulares.add(titular);
    }

    /*
     * Método privado para determinar que una cuenta no sea identica a otra cuenta
     * @return cuentas filtradas
     */
    private boolean cuentasExistentes(int numeroCuenta){
        Predicate<CuentaBancaria> cuentaIgual = cuentaBancaria -> cuentaBancaria.getNumeroCuenta() == numeroCuenta ;
        return cuentas.stream().filter(cuentaIgual).findAny().isPresent();
    }

public void mostrarEstadoCuentas() {
    System.out.println("Estado de cuentas del banco " + nombre + ":");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Titular: " + cuenta.geTitular());
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println("Estado Cuenta: " + cuenta.estadoCuenta());
            System.out.println("-----------------------");
        }
    }
}
/*
 * Método opcional para el método transferir dinero en la clase transacción
 */
//public static boolean cuentasExistentes(Collection<CuentaBancaria> cuentas,int numeroCuenta){
        //Predicate<CuentaBancaria> cuentaIgual = cuentaBancaria -> cuentaBancaria.getNumeroCuenta() == numeroCuenta ;
        //return cuentas.stream().filter(cuentaIgual).findAny().isPresent();
    //}

