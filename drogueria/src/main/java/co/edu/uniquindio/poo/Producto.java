package co.edu.uniquindio.poo;

public abstract class Producto {
    private final String idProducto;
    private final String nombre;
    private final String descripcion;
    private final int precio;
    private final int cantidadStock;
    private final String idProveedor;

    public Producto (String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.idProveedor = idProveedor;
        assert cantidadStock > 0;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public String getIdProveedor() {
        return idProveedor;
    }
}
