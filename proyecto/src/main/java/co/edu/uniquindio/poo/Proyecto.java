package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Proyecto {

    private final Collection<ParqueInfantil> listaParquesInfantiles;

    /*
     * Método constructor de la clase Proyecto
     */
    public Proyecto (){
        listaParquesInfantiles = new LinkedList<>();
    }

    /*
     * Método para obtener la lista no modificable de parques infantiles 
     */
    public Collection<ParqueInfantil> getListaParquesInfantiles() {
        return listaParquesInfantiles;
    }

    /*
     * Método para añadir un parque infantil al proyecto
     */
    public void añadirParqueInfantil (ParqueInfantil parqueInfantil){
        assert !existeParqueInfantil(parqueInfantil.getNombre());
        listaParquesInfantiles.add(parqueInfantil);
    }

    /*
     * Método para calcular el valor total del proyectp
     */
    public double calcularValorProyecto (){
        return listaParquesInfantiles.stream().mapToDouble(n -> n.calcularValor()).sum();
    }

    /*
     * Método para obtener un parque infantil por su nombre
     */
    public ParqueInfantil getParqueNombre (String nombre){
        Predicate<ParqueInfantil> nombreIgual = parqueInfantil -> parqueInfantil.getNombre().equals(nombre);
        var posibleParque = listaParquesInfantiles.stream().filter(nombreIgual).findAny();
        assert posibleParque.isPresent();
        return posibleParque.get();
    }

    /*
     * Método para obtener los parques ordenados por el nombre de municipio
     */
    public Collection<ParqueInfantil> getParqueMunicipio(String municipio){
        var comparador = Comparator.comparing(ParqueInfantil :: getNombre);
        var parquesOrdenados = listaParquesInfantiles.stream().filter(parqueInfantil -> parqueInfantil.getMunicipio().name().equals(municipio)).sorted(comparador).toList();
        return Collections.unmodifiableCollection(parquesOrdenados);
    }

    /*
     * Método para obtener la lista de parques por valor ascendente
     */
    public Collection<ParqueInfantil> listaOrdenada (){
        var comparador = Comparator.comparing(ParqueInfantil :: calcularValor);
        var parquesOrdenadosValor = listaParquesInfantiles.stream().sorted(comparador).toList();
        return Collections.unmodifiableCollection(parquesOrdenadosValor);
    }
    
    /*
     * Método privado para determinar si existe un parque infantil con nombre igual
     */
    private boolean existeParqueInfantil(String nombre){
        Predicate<ParqueInfantil> nombreIgual = parqueInfantil -> parqueInfantil.getNombre().equals(nombre);
        return listaParquesInfantiles.stream().filter(nombreIgual).findAny().isPresent();
    }

   

}
