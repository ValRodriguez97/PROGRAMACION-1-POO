package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private final String idEmpleado;
    private final double salario;

    public Empleado (String idEmpleado, double salario, String nombres, String apellidos, String dni, String direccion, String telefono){
        super(nombres, apellidos, dni, direccion, telefono);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + idEmpleado + ", salario=" + salario + "]";
    }

    public String getIdEmpleado (){
        return idEmpleado;
    }

    public double getSalario (){
        return salario;
    }
    
}

