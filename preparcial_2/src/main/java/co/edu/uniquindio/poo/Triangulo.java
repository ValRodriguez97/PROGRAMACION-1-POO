package co.edu.uniquindio.poo;

public class Triangulo extends Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        assert base > 0;
        assert altura > 0;
    }

    public double getBase (){
        return base;
    }

    public double getAltura (){
        return altura;
    }

    @Override

    public double calcularArea (){
        return (base*altura)/2;
    }

}
