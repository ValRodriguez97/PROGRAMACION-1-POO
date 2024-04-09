package co.edu.uniquindio.poo;

public abstract class Rectangulo extends FiguraGeometrica {

    private final double ancho;
    private final double alto;   

    public Rectangulo (double calcularArea, double ancho, double alto){
        super(calcularArea);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {        
        return alto;
    }

    @Override
    public double getCalcularArea (){
        return ancho *alto;
    }

}
