package co.edu.uniquindio.poo;

public abstract class FiguraGeometrica { // no se puede instanciar una clase abstracta
    private double calcularArea;

    public abstract double calcularArea();

    public FiguraGeometrica (double calcularArea){
        this.calcularArea = calcularArea;
    }

    public double getCalcularArea(){
        return calcularArea;
    }

}

