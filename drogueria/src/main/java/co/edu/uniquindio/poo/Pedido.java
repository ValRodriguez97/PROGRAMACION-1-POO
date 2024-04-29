package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto producto;
    private final Cliente cliente;

    /*
     * Método constructor de la clase Pedido
     */
    public Pedido(LocalDate fecha, int cantidad, Producto producto, Cliente cliente){
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
        this.cliente = cliente;
        assert producto.getCantidadStock() > 0;
    }

    /*
     * Método para obtener una fecha
     * @return fecha de un pedido
     */
    public LocalDate getFecha (){
        return fecha;
    }

    /*
     * Método para obtener una cantidad de un pedido
     * @return cantidad de un pedido
     */
    public int getCantidad (){
        return cantidad;
    }

    /*
     * Método para obtener el producto de un pedido
     * @return producto pedido
     */
    public Producto getProducto (){
        return producto;
    }

    /*
     * Método para obtener un cliente 
     * @return cliente de un pedido
     */
    public Cliente getCliente (){
        return cliente;
    }

    /*
     * Método para calcular el costo total de un pedido
     * @return costo total de un pedido
     */
    public double calcularValorPedido (){
        return getCantidad() * producto.getPrecio();
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", productoPedido=" + producto
                + ", clientePedido=" + cliente + "]";
    }
}
