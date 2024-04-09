package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {
    
    private final double lado;
        
    public Cuadrado(double area,double ancho, double alto, double lado){
        super(ancho, alto, area);
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

}