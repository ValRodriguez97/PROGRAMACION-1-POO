package co.edu.uniquindio.poo;


public class Zona { 

    private final String nombre;
    private final FiguraGeometrica [] figuras;

    public Zona (String nombre){
        this.nombre = nombre;
        this.figuras = new FiguraGeometrica[2];

    }

    public String getNombre() {
        return nombre;
    }

    public FiguraGeometrica[] getFiguras() {
        return figuras;
    }

}
