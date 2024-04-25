package co.edu.uniquindio.poo;

import java.util.Collection;
//import java.util.Comparator;
import java.util.LinkedList;
//import java.util.function.Predicate;
//import java.util.function.Predicate;

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

    public void agregarPedido (Pedido pedido){
        assert listaPedidos != null;
        //assert !productoSinStock (pedido.geProductoPedido().getCantidadStock());
        listaPedidos.add(pedido);
    }

    public void agregarProducto (Producto producto){
        assert listaProductos != null;
        listaProductos.add(producto);
    }

    public Collection <Producto> getProductoStock100 (){
        return listaProductos.stream().filter(producto -> producto.getCantidadStock() > 100).toList();
    }

    public void agregarPersona (Persona persona){
        listaPersonas.add(persona);
    }

    //private boolean productoSinStock (int cantidadStock){
       //Predicate <Pedido> pedidoVacio = pedido -> pedido.geProductoPedido().getCantidadStock() != 0;
       // return listaPedidos.stream().filter(pedidoVacio).findAny().isPresent();
    //}


}
//*Una estructura de datos puede añadir, eliminar, limpiar y obtener - add, remove, clean and get */