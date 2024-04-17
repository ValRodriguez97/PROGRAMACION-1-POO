package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    private final String ingredientes;

    public CuidadoPersonal (String ingredientes, String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor){
        super(idProducto, nombre, descripcion, precio, cantidadStock, idProveedor);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes (){
        return ingredientes;
    }

}
