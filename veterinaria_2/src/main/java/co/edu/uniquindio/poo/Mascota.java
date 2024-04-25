package co.edu.uniquindio.poo;

public class Mascota{
    private final String numeroIdentificacion;
    private final String nombre;
    private final String especie;
    private final String raza;
    private final byte edad;
    private final String genero;
    private final String color;
    private final float peso;

    public Mascota(String numeroIdentificacion, String nombre, String especie, String raza, byte edad, String genero, String color, Float peso){
        this.numeroIdentificacion =numeroIdentificacion;
        this.nombre =nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;

        assert numeroIdentificacion != null : "El numero de identificacion debe ser diferente de null";
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";
        assert especie != null && !especie.isBlank() : "La especie debe ser diferente de null";
        assert raza != null && !raza.isBlank(): "La raza debe ser diferente de null";
        assert edad > (byte) 0;
        assert genero != null && !genero.isBlank() : "El genero debe ser diferente de null";
        assert color != null && !color.isBlank() : "El color debe ser diferente de null";
        assert peso > (float)0;   
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public byte getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getColor() {
        return color;
    }

    public float getPeso() {
        return peso;
    }
    
}