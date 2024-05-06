package co.edu.uniquindio.poo;

public class Titular {
    private final String nombresTitular;
    private final String apellidosTitular;

    /*
     * Método Constructor de la clase Titular
     */
    public Titular (String nombresTitular, String apellidosTitular){
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        assert nombresTitular != null && !nombresTitular.isBlank() : "Error, el nombre del titular no debe de ser nulo y no debe de estar vacio";
        assert apellidosTitular != null && !apellidosTitular.isBlank() : "Error, el apellido del titular no debe de ser nulo y no debe de estar vacio";
    }

    /*
     * Método para obtener el nombre de un titular 
     * @return nombre titular
     */
    public String getNombresTitular (){
        return nombresTitular;
    }

    /*
     * Método para obtener los apellidos de un titular
     * @return apellidos titular
     */
    public String getApellidosTitular (){
        return apellidosTitular;
    }
}
