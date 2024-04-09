package co.edu.uniquindio.poo;

public class Triangulo extends FiguraGeometrica{
    private final double base;
    private final double altura;

    public Triangulo(double area, double base, double altura) {
        super(area);
        this.base = base;
        this.altura = altura;
    }

    public double getBase (){
        return base;
    }

    public double getAltura (){
        return altura;
    }

}
