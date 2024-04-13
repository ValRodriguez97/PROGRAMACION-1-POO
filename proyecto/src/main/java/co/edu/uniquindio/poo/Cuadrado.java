package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {
    
    private final double lado;
        
    public Cuadrado(double calcularArea,double ancho, double alto, double lado){
        super(ancho, alto, calcularArea);
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    

}