package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class ParqueInfantil {

    private final String nombre;
    private final String descripcion;
    private final Collection <Zona> listaZonas;

    public ParqueInfantil (String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        listaZonas = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Collection<Zona> getListaZonas() {
        return listaZonas;
    }


    

}
