package co.edu.uniquindio.poo;

public class ProductoHogar extends Producto {
    private final String indicaciones;

    public ProductoHogar (String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor, String indicaciones){
        super(idProducto, nombre, descripcion, precio, cantidadStock, idProveedor);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones(){
        return indicaciones;
    }

}
