package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public abstract class Figura {
    private final String nombre;
    private final Collection<Figura> figuras;
    public abstract double calcularArea ();

    public Figura (String nombre){
        this.nombre = nombre;
        figuras = new LinkedList<>();
    }

    public String getNombre (){
        return nombre;
    }

    public Collection<Figura> getFiguras (){
        return figuras;
    }

    public void agregarFigura (Figura figura){
        figuras.add(figura);
    }

    public Collection<Figura> figurasOrdenadas(){
        var comparador = Comparator.comparing(Figura :: calcularArea);
        var figuraOrdenada = figuras.stream().sorted(comparador).toList();
        return Collections.unmodifiableCollection(figuraOrdenada);
    }


    




}
