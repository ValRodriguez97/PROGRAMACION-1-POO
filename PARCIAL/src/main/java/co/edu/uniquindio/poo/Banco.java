package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Banco {
    private final String nombre;
    public static Collection<CuentaBancaria> cuentas;
    public Collection<Titular> titulares;

    public Banco (String nombre){
        this.nombre = nombre;
        assert nombre != null && !nombre.isBlank() : "Error, el nombre debe ser diferente de null y no puede estar vacio";
        Banco.cuentas = new LinkedList<>();
        this.titulares = new LinkedList<>();
    }

    public String getNombre (){
        return nombre;
    }

    public Collection<CuentaBancaria> getCuentas(){
        return Collections.unmodifiableCollection(cuentas);
    }

    public Collection<Titular> getTitulares (){
        return Collections.unmodifiableCollection(titulares);
    }

    public void añadirCuentasBancarias (CuentaBancaria cuentaBancaria){
        assert !cuentasExistentes (cuentas, cuentaBancaria.getNumeroCuenta()) : "La cuenta ya existe";
        cuentas.add(cuentaBancaria);
    }

    public void añadirTitulares (Titular titular){
        titulares.add(titular);
    }

    public static boolean cuentasExistentes(Collection<CuentaBancaria> cuentas,int numeroCuenta){
        Predicate<CuentaBancaria> cuentaIgual = cuentaBancaria -> cuentaBancaria.getNumeroCuenta() == numeroCuenta ;
        return cuentas.stream().filter(cuentaIgual).findAny().isPresent();
    }
}

