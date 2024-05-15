package fiesta.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Fiesta {
    private String nombre;
    private ArrayList<IInvitado> listaInvitados = new ArrayList<>();
    private Mesero [] meseros = new Mesero [3];
    
    public Fiesta( String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<IInvitado> getListaInvitados() {
        return listaInvitados;
    }

    public Mesero[] getMeseros() {
        return meseros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setListaInvitados(ArrayList<IInvitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public void setMeseros(Mesero[] meseros) {
        this.meseros = meseros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fiesta [nombre=" + nombre + ", listaInvitados=" + listaInvitados + ", meseros="
                + Arrays.toString(meseros) + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((listaInvitados == null) ? 0 : listaInvitados.hashCode());
        result = prime * result + Arrays.hashCode(meseros);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fiesta other = (Fiesta) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (listaInvitados == null) {
            if (other.listaInvitados != null)
                return false;
        } else if (!listaInvitados.equals(other.listaInvitados))
            return false;
        if (!Arrays.equals(meseros, other.meseros))
            return false;
        return true;
    }   

    public void ingresarFiesta (IInvitado invitado){
        getListaInvitados().add(invitado);
    }

    public void salirDeLaFiesta(IInvitado invitado){
        getListaInvitados().remove(invitado);
    }

    public void bailarTodos(){
        for (IInvitado invitado : listaInvitados){
            invitado.bailar();
        }
    }
}
//todas las clases en java heredan de la clase object
//a==b, son iguales, es decir ocupan el mismo espacio
