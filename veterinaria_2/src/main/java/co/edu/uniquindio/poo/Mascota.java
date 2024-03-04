package co.edu.uniquindio.poo;

public record Mascota(String numeroIdentificacion, String nombre, String especie, String raza, byte edad, String genero, String color, Float peso ) {


    public Mascota{
        
        assert numeroIdentificacion != null : "El numero de identificacion debe ser diferente de null";
        assert nombre != null : "El nombre debe ser diferente de null";
        assert especie != null  : "La especie debe ser diferente de null";
        assert raza != null : "La raza debe ser diferente de null";
        assert edad >= (byte) 0;
        assert genero != null  : "El genero debe ser diferente de null";
        assert color != null : "El color debe ser diferente de null";
        assert peso != (float)0;

        assert numeroIdentificacion != "";
        assert nombre != "";
        assert especie != "";
        assert raza != "";
        assert edad > 0;
        assert genero != "";
        assert color != "";
        assert peso >0;

        assert edad < 25;
    }
}