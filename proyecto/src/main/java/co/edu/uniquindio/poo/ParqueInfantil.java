package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ParqueInfantil {

    private final String nombre;
    private final String descripcion;
    private final Municipio municipio;
    private final Collection <Zona> listaZonas;
    
    /*
     * Método constructor de la clase Parque Infantil
     */
    public ParqueInfantil (String nombre, String descripcion, Municipio municipio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
        assert nombre != null && !nombre.isBlank();
        assert descripcion != null && !nombre.isBlank();
        this.listaZonas = new LinkedList<>();

    }

    /*
     * Método para obtener el nombre del parque
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método para obtener la descripcion del parque
     */
    public String getDescripcion() {
        return descripcion;
    }

    /*
     * Método para obtener el municipio
     */
    public Municipio getMunicipio() {
        return municipio;
    }

    /*
     * Método para añadir una zona a un parque infantil
     */
    public void agregarZona (Zona zona){
        assert !existeZonaParque(zona.getNombre());
        listaZonas.add(zona);
    }

    /*
     * Método para obtener la lista de Zonas de un parque
     */
    public Collection<Zona> getListaZonas() {
        return listaZonas;
    }

    /*
     * Método para calcular el valor del parque infantil
     */
    public double calcularValor (){
        return listaZonas.stream().mapToDouble(n -> n.calcularValor()).sum() + municipio.getSobreCosto();
    }

    /*
     * Método privado para determinar si existe una zona con igual nombre
     */
    private boolean existeZonaParque(String nombre){
        Predicate<Zona> nombreIgual = zona -> zona.getNombre().equals(nombre);
        return listaZonas.stream().filter(nombreIgual).findAny().isPresent();
    }
}
