package co.edu.uniquindio.poo;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> listaMascotas;

    public Veterinaria(String nombre){
        assert nombre != null : "El nombre no puede ser nulo";
        this.nombre = nombre;
        listaMascotas = new LinkedList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarMascota (Mascota mascota) {
        assert numeroIdentificacionExistente (mascota.numeroIdentificacion()) == false : "El numero de identificacion ya existe" ;
        listaMascotas.add(mascota);
    }

    private boolean numeroIdentificacionExistente (String numeroIdentificacion) {
        boolean exist = false;

        for (Mascota mascota : listaMascotas) {
            if (mascota.numeroIdentificacion().equals(numeroIdentificacion)){
                exist = true;
            }
        }
        return exist;
    }

    public Collection <Mascota> getlistaMascotas() {
        return Collections.unmodifiableCollection(listaMascotas);
    }
}
