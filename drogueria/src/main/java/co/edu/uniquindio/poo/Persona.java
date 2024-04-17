package co.edu.uniquindio.poo;


public class Persona {
    private final String nombres;
    private final String apellidos;
    private final String dni;
    private final String direccion;
    private final String telefono;
    

    public Persona (String nombres, String apellidos, String dni, String direccion, String telefono){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public String getNombres() {
        return nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public String getDni() {
        return dni;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getTelefono() {
        return telefono;
    }

}
