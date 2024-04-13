package co.edu.uniquindio.poo;

public enum Material {

    ARENA(10000), 
    GRAMA_SINTENTICA(35000), 
    GRAMA_NATURAL(20000), 
    ASFALTO(40000);

    private final int valorMetroCuadrado;

    public int valorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    private Material (int valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }


}
