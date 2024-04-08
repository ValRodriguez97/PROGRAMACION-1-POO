package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class ParqueInfantil {

    private final String nombre;
    private final String descripcion;
    private final Collection <Zona> listaZonas;
    private final Municipio municipio;

    public ParqueInfantil (String nombre, String descripcion, Municipio municipio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        listaZonas = new LinkedList<>();
        this.municipio = municipio;

    }

    public Municipio getMunicipio() {
        return municipio;
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
