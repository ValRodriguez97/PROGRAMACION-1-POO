package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto productoPedido;
    private final Cliente clientePedido;


    public Pedido(LocalDate fecha, int cantidad, Producto producto, Cliente cliente){
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = producto;
        this.clientePedido = cliente;
        assert productoPedido.getCantidadStock() > 0;
    }

    public LocalDate getFecha (){
        return fecha;
    }

    public int getCantidad (){
        return cantidad;
    }

    public Producto geProductoPedido(){
        return productoPedido;
    }

    public Cliente gClientePedido (){
        return clientePedido;
    }

    public double calcularValorPedido (){
        return getCantidad() * productoPedido.getPrecio();
    }

    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", productoPedido=" + productoPedido
                + ", clientePedido=" + clientePedido + "]";
    }

}
