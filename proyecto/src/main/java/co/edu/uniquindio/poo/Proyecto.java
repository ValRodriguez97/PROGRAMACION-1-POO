package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Proyecto {

    private final String nombre;
    private final Collection<ParqueInfantil> listaParquesInfantiles;

    public Proyecto (String nombre){
        this.nombre = nombre;
        listaParquesInfantiles = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<ParqueInfantil> getListaParquesInfantiles() {
        return listaParquesInfantiles;
    }
}
