package co.edu.uniquindio.poo;


public class Zona { 

    private final String nombre;
    private final FiguraGeometrica figura;
    private final Material material;

    public Material getMaterial() {
        return material;
    }

    public Zona (String nombre, Material material, FiguraGeometrica figura){
        this.nombre = nombre;
        this.figura = figura;
        this.material = material;

    }

    public String getNombre() {
        return nombre;
    }

    public FiguraGeometrica getFiguras() {
        return figura;
    }

    

}
