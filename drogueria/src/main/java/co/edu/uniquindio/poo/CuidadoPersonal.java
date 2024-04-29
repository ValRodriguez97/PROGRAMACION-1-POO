package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    private final String ingredientes;

    /*
     * Método constructor de la clase CuidadoPersonal
     */
    public CuidadoPersonal (String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String proveedor, String ingredientes){
        super(idProducto, nombre, descripcion, precio, cantidadStock, proveedor);
        this.ingredientes = ingredientes;
    }

    /*
     * Método para obtener los ingredientes del producto de CuidadoPersonal
     * @return ingredientes del producto de cuidado personal
     */
    public String getIngredientes (){
        return ingredientes;
    }

    /*
     * Método toString de la clase CuidadoPersonal
     */
    @Override
    public String toString() {
        return "CuidadoPersonal [ingredientes=" + ingredientes + "]";
    }

}
