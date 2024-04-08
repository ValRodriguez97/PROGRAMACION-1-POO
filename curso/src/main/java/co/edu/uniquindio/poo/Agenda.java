package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Agenda {
    private final String nombre;
    private final String descripcion;
    private final Collection <Contacto> listaContactos;

    public Agenda (String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaContactos = new LinkedList<>(); // lista enlazada
    }
    public getNombre (){
        return nombre;
    }





}

