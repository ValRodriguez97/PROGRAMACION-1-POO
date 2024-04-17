package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Gerente extends Empleado{
    private ArrayList<Pedido> listaPedidos;
    
    public Gerente (String idEmpleado, double salario, String nombres, String apellidos, String dni, String direccion, String telefono){
        super(idEmpleado, salario, nombres, apellidos, dni, direccion, telefono);
    }
    
    public void agregarPedido (Pedido pedido){
        listaPedidos.add(pedido);
    }

    public void eliminarPedido (Pedido pedido){
        listaPedidos.remove(pedido);
    }

}
