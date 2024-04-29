package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private final double salario;

    /*
     * Método constructor de la clase Empleado
     */
    public Empleado (String nombres, String apellidos, String dni, String direccion, String telefono, double salario){
        super(nombres, apellidos, dni, direccion, telefono);
        this.salario = salario;
    }

    /*
     * Método para obtener el salario de un empleado
     * @return salario del empleado
     */
    public double getSalario (){
        return salario;
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Empleado [salario=" + salario + "]";
    } 
}

