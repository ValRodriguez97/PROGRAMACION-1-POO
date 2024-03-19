package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Cine { // se hace publica la clase 

    private final String nombre; //final para que el nombre no se cambie
    private final Collection <Boleta> listaBoletas; 

    public Cine(String nombre){
    assert nombre != null; //excepcion que se ejecuta en CineTest
    this.nombre = nombre; 
    this.listaBoletas = new LinkedList<Boleta>(); //creacion de listas
    }

    public String getNombre(){ //metodo get para obtener el nombre 
    return nombre;
    }

    public Collection<Boleta> getlistaBoletas(){ //metodo para que la lista no se pueda modificar
        return Collections.unmodifiableCollection(listaBoletas);
    }

    public void registrarBoleta(Boleta boleta){ //metodo para registrar una boleta en la lista con la excepcion de que no se registrara si el valor es menor a 5000
       if (boleta.valor() < 5000){
            throw new IllegalArgumentException("No se puede registrar una boleta con un valor menor a 5000 pesos");
        }
        listaBoletas.add(boleta);
    }

    //public void registrarBoleta (Boleta boleta){
    //    assert boletaValorMayor (boleta.valor())== false;
    //    listaBoletas.add(boleta);
    //}

    //private boolean boletaValorMayor (int valor){
    //    boolean mayor = false;
    //    for (Boleta boleta : listaBoletas){
    //        if (boleta.valor() < 5000){
    //            mayor = true;
    //        }
    //    }
    //    return mayor;
    //}

    
    public Collection<Boleta> getListadoMenoresEdad() {
        return listaBoletas.stream().filter(estudiante -> estudiante.valor() < 4000).toList();
    }
}
