package co.edu.uniquindio.poo;

public enum Material {

    ARENA(10000), 
    GRAMA_SINTENTICA(35000), 
    GRAMA_NATURAL(20000), 
    ASFALTO(40000);

    private final double valorMetroCuadrado;

    /*
     * Método constructor de la clase enum Material
     */
    private Material (int valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    /*
     * Método para obtener el valor por metro cuadrado de un material
     */
    public double valorMetroCuadrado() {
        return valorMetroCuadrado;
    }
}
