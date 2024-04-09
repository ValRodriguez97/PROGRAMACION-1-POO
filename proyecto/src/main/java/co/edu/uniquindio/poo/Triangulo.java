package co.edu.uniquindio.poo;

public abstract class Triangulo extends FiguraGeometrica{
    private final double base;
    private final double altura;

    public Triangulo(double calcularArea, double base, double altura) {
        super(calcularArea);
        this.base = base;
        this.altura = altura;
    }

    public double getBase (){
        return base;
    }

    public double getAltura (){
        return altura;
    }

    @Override
    public double getCalcularArea (){
        return base * altura;
    }


}
