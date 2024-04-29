package co.edu.uniquindio.poo;

import java.util.Collection;

public class Gerente extends Empleado{
    private Collection<Producto> productos;
    
    /*
     * Método constructor de la clase Gerente
     */
    public Gerente (String nombres, String apellidos, String dni, String direccion, String telefono, double salario){
        super(nombres, apellidos, dni, direccion, telefono, salario);
    }
    
    /*
     * Método para agregar un producto
     */
    public void agregarProducto (Producto producto){
        productos.add(producto);
        
    }

    /*
     * Método para eliminar un producto
     */
    public void eliminarProducto (Producto producto){
        productos.remove(producto);
    }
}
