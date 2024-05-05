package co.edu.uniquindio.poo;

public class Titular {
    private final String nombresTitular;
    private final String apellidosTitular;

    public Titular (String nombresTitular, String apellidosTitular){
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        assert nombresTitular != null && !nombresTitular.isBlank() : "Error, el nombre del titular no debe de ser nulo y no debe de estar vacio";
        assert apellidosTitular != null && !apellidosTitular.isBlank() : "Error, el apellido del titular no debe de ser nulo y no debe de estar vacio";
    }

    public String getNombresTitular (){
        return nombresTitular;
    }

    public String getApellidosTitular (){
        return apellidosTitular;
    }

}
