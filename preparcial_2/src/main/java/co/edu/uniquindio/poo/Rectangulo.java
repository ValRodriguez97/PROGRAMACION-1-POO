package co.edu.uniquindio.poo;

public class Rectangulo extends Figura{
    private final double ancho;
    private final double alto;

    public Rectangulo (double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
        assert ancho >0;
        assert alto >0;
    }

    public double getAncho (){
        return ancho;
    }

    public double getAlto (){
        return alto;
    }

    @Override
    public double calcularArea(){
        return ancho * alto;
    }

}
