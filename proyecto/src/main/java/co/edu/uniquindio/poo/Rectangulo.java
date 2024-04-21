package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {

    private final double ancho;
    private final double alto;   

    /*
     * Método constructor de la clase Rectangulo
     */
    public Rectangulo (double ancho, double alto){
        assert ancho > 0;
        assert alto > 0;
        this.ancho = ancho;
        this.alto = alto;
    }

    /*
     * Método para obtener el valor del ancho de un rectangulo
     */
    public double getAncho() {
        return ancho;
    }

    /*
     * Método para obtener el valor del alto de un rectangulo 
     */
    public double getAlto() {        
        return alto;
    }

    /*
     * Método para calcular el area de un rectangulo
     */
    @Override
    public double calcularArea (){
        return ancho *alto;
    }
}
