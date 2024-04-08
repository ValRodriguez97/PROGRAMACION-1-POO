package co.edu.uniquindio.poo;


public class Zona { 

    private final String nombre;
    private final FiguraGeometrica [] figuras;
    private final Material material;

    public Material getMaterial() {
        return material;
    }

    public Zona (String nombre, Material material){
        this.nombre = nombre;
        this.figuras = new FiguraGeometrica[3];
        this.material = material;

    }

    public String getNombre() {
        return nombre;
    }

    public FiguraGeometrica[] getFiguras() {
        return figuras;
    }

}
