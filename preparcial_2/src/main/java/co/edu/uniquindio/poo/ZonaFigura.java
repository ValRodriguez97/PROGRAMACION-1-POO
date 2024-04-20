package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class ZonaFigura {
    private final String nombre;
    private final Collection<Figura> listaFiguras;

    public ZonaFigura (String nombre){
        assert nombre != null: "el nombre no puede ser nulo";
        listaFiguras = new LinkedList<>();
        assert listaFiguras != null;
        this.nombre = nombre;
    }

    public String getNombre (){
        return nombre;
    }

    public Collection<Figura> getListaFiguras (){
        return listaFiguras;
    }

    public void añadirFigura (Figura figura){
        listaFiguras.add(figura);
    }

    public Collection<Figura> getFiguras(){
        return Collections.unmodifiableCollection(listaFiguras);
    }

    public Collection<Figura> FigurasOrdenadas(Collection<Figura> listFiguras){
        var ordenador = Comparator.comparing(Figura :: calcularArea).reversed();
        var figuraOrdenada = listaFiguras.stream().sorted(ordenador).toList();
        assert figuraOrdenada != null;
        assert listFiguras.size() > 0 ;
        return Collections.unmodifiableCollection(figuraOrdenada);
    }
}
