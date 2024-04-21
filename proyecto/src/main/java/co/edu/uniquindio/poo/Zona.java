package co.edu.uniquindio.poo;


public class Zona { 

    private final String nombre;
    private final FiguraGeometrica figura;
    private final Material material;

    /*
     * Método constructor para la clase Zona
     */
    public Zona (String nombre, Material material, FiguraGeometrica figura){
        this.nombre = nombre;
        this.figura = figura;
        this.material = material;
        assert nombre != null && !nombre.isBlank();
    }

    /*
     * Método para obtener el nombre de la zona
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método para obtener la figura geometrica de la zona
     */
    public FiguraGeometrica getFiguras() {
        return figura;
    }

    /*
     * Método para obtener el material de una zona
     */
    public Material getMaterial() {
        return material;
    }


    public double calcularValor (){
        return figura.calcularArea() * material.valorMetroCuadrado();
    }

    

}
