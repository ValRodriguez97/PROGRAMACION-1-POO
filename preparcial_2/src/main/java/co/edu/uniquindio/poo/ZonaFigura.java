package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class ZonaFigura {
    private final String nombre;
    private final Collection<Figura> listaFiguras;
    /*
     * Método constructor 
     */
    public ZonaFigura (String nombre){
        this.nombre = nombre;
        assert nombre != null: "el nombre no puede ser nulo";
        listaFiguras = new LinkedList<>();
        assert listaFiguras != null;
    }

    /*
     * Método para obtener el nombre 
     * @return nombre
     */
    public String getNombre (){
        return nombre;
    }

     /*
     * Método para obtener la coleccion no modificable de figuras
     * @return listaFiguras
     */
    public Collection<Figura> getFiguras(){
        return Collections.unmodifiableCollection(listaFiguras);
    }
    
    /*
     * Método para añadir figuras a la lista
     */
    public void añadirFigura (Figura figura){
        listaFiguras.add(figura);
    }

    /*
     * Método para ordenar una lista de acuerdo al area de una figura 
     * @return figuraOrdenada
     */
    public Collection<Figura> FigurasOrdenadas(Collection<Figura> listFiguras){
        var ordenador = Comparator.comparing(Figura :: calcularArea).reversed();
        var figuraOrdenada = listaFiguras.stream().sorted(ordenador).toList();
        assert figuraOrdenada != null;
        assert listFiguras.size() > 0 ;
        return Collections.unmodifiableCollection(figuraOrdenada);
    }
}
