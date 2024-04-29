package co.edu.uniquindio.poo;

public class ProductoHogar extends Producto {
    private final String indicaciones;

    /*
     * Método constructor de la clase ProductoHogar
     */
    public ProductoHogar (String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String proveedor, String indicaciones){
        super(idProducto, nombre, descripcion, precio, cantidadStock, proveedor);
        this.indicaciones = indicaciones;
    }

    /*
     * Método para obtener las indicaciones de un productoHogar
     * @return indicaciones de un producto para el cuidado del hogar
     */
    public String getIndicaciones(){
        return indicaciones;
    }

    /*Método toString */
    @Override
    public String toString() {
        return "ProductoHogar [indicaciones=" + indicaciones + "]";
    }
}
