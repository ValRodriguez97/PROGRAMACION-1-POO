package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, Float peso) {

    public Mascota{
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert edad != (byte) 0;
        assert genero != null;
        assert color != null;
        assert peso != (float)0;

        assert nombre != "";
        assert especie != "";
        assert raza != "";
        assert edad != 0;
        assert genero != "";
        assert color != "";
        assert peso != 0;

        assert edad < 25;
        

        

    }

    
}
