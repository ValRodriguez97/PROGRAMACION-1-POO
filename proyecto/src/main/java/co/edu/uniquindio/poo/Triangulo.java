package co.edu.uniquindio.poo;

public class Triangulo extends FiguraGeometrica{
    private final double base;
    private final double altura;

    /*
     * Método constructor de la clase Triangulo
     */
    public Triangulo( double base, double altura) {
        assert base > 0;
        assert altura > 0;
        this.base = base;
        this.altura = altura;
    }

    /*
     * Método para obtener la base de un triangulo
     */
    public double getBase (){
        return base;
    }

    /*
     * Método para obtener la altura de un triangulo
     */
    public double getAltura (){
        return altura;
    }

    /*
     * Método para calcular el area de un triangulo
     */
    @Override
    public double calcularArea (){
        return ((base * altura)/2);
    }


}
