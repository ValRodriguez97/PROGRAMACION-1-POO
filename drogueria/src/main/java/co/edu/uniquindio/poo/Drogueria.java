package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;

public class Drogueria {
    private final String nombre;
    private final Collection<Persona> personas;
    private final Collection<Producto> productos;
    private final Collection<Pedido> pedidos;

    /*
     * Método construtor de la clase Drogueria
     */
    public Drogueria (String nombre){
        this.nombre =nombre;
        personas = new LinkedList<>();
        productos = new LinkedList<>();
        pedidos = new LinkedList<>();
    }

    /*
     * Método para obtener el nombre de la drogueria
     * @return nombre de la Drogueria
     */
    public String getNombre (){
        return nombre;
    }

    /*
     * Método para obtener la lista no modificable de personas
     * @return lista no modifiable de personas
     */
    public Collection<Persona> getListaPersonas(){
        return Collections.unmodifiableCollection(personas);
    }

    /*
     * Método para obtener la lista no modificable de productos
     * @return lista no modificable de productos
     */
    public Collection<Producto> getListaProductos(){
        return Collections.unmodifiableCollection(productos);
    }
    
    /*
     * Metodo para obtener la coleccion no modificable de pedidos
     * @return lista no modificable de pedidos
     */
    public Collection<Pedido> getListarPedidos(){
        return Collections.unmodifiableCollection(pedidos);
    }

    /*
     * Método para agregar un pedido a drogueria
     */
    public void agregarPedido (Pedido pedido){
        assert pedidos != null;
        pedidos.add(pedido);
    }

    /*
     * Método para agregar un producto a droguería
     */
    public void agregarProducto (Producto producto){
        assert productos != null;
        productos.add(producto);
    }

    /*
     * Método para agregar una persona a droguería
     */
    public void agregarPersona (Persona persona){
        assert personas != null;
        personas.add(persona);
    }

    /*
     * Método para obtener la lista de productos con cantidad de stock superior a 100 unidades de menor a mayor
     * @return lista de productos con stock mayor a 100
     */
    public Collection <Producto> getProductoStock100 (){
        return productos.stream().filter(producto -> producto.getCantidadStock() > 100).toList();
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Drogueria [nombre=" + nombre + ", listaPersonas=" + personas + ", listaProductos=" + productos
                + ", listaPedidos=" + pedidos + "]";
    }

}
