package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
    private final double dosis;

    public Medicamento(double dosis, String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor){
        super(idProducto, nombre, descripcion, precio, cantidadStock, idProveedor);
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento [dosis=" + dosis + "]";
    }

    public double getDosis (){
        return dosis;
    }
}
