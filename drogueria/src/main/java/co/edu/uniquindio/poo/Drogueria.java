package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Drogueria {
    private final String nombre;
    private final Collection<Persona> listaPersonas;
    private final Collection<Producto> listaProductos;
    private final Collection<Pedido> listaPedidos;

    public Drogueria (String nombre){
        this.nombre =nombre;
        listaPersonas = new LinkedList<>();
        listaProductos = new LinkedList<>();
        listaPedidos = new LinkedList<>();
    }

    public String getNombre (){
        return nombre;
    }

    public Collection<Persona> getListaPersonas(){
        return listaPersonas;
    }

    public Collection<Producto> getListaProductos(){
        return listaProductos;
    }
    
    public Collection<Pedido> getListarPedidos(){
        return listaPedidos;
    }
}
//*Una estructura de datos puede añadir, eliminar, limpiar y obtener - add, remove, clean and get */