package co.edu.uniquindio.poo;

public class Triangulo extends Figura {
    private final double base;
    private final double altura;

    public Triangulo(String nombre,double calcularArea,double base, double altura){
        super(nombre);
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

    public double calcularArea (){
        return (base*altura)/2;
    }

}
