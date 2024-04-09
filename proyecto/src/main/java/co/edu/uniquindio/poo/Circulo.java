package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica{
    private final double radio;

    public Circulo (double area, double radio){
        super(area);
        this.radio = radio;
    }

    public double getRadio (){
        return radio;
    }

}
