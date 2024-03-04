package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, Float peso) {

    public Mascota{

        assert nombre != null && nombre.isBlank() : "El nombre debe ser diferente de null";
        assert especie != null && especie.isBlank() : "La especie debe ser diferente de null";
        assert raza != null && raza.isBlank() : "La raza debe ser diferente de null";
        assert edad >= (byte) 0;
        assert genero != null && genero.isBlank() : "El genero debe ser diferente de null";
        assert color != null && color.isBlank() : "El color debe ser diferente de null";
        assert peso != (float)0;

  

    }


    
}
