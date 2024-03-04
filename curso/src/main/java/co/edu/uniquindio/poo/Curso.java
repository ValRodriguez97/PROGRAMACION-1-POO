package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {

    private final String nombre;
    private final Collection <Estudiante> listaEstudiantes; /*Lista, generica, no especifica que tipo de lista es 
    Que contiene la coleecion -> Estudiantes y se va a llamar listaEstudiantes.*/

    public Curso(String nombre){ /*Public o constructpr le da los valores a los atributos */
        this.nombre = nombre;    /*this, yo mismo, este nombre, uno mismo */
        this.listaEstudiantes = new LinkedList <Estudiante> ();   /* elementos que estan conectados unos tras otros. new -> se creo un espacio de memoria*/

    }
    /*Cada atributo tiene dos metodos, set .> cambiar el valor del atributo. Git
     * Final -> no se puede modificar el nombre . get es para obtener el valor de un atributo
    */
    // public void setNombre (String nombre){
    //   this.nombre = nombre;
    //}

    /*colecction -> por dentro tiene mas atributos */

    public String getNombre(){
        return nombre;

    }

    public Collection<Estudiante> getListaEstudiantes(){
        return Collections.unmodifiableCollection(listaEstudiantes);/*Retorna una lista que no se puede modificar */
    }

    public void registrarEstudiante(Estudiante estudiante){
        assert verificarNumeroIdentificacion(estudiante.numeroIdentificacion())==false:"Ya existe un estudiante con ese numero de identficacion" +estudiante.numeroIdentificacion(); /*Si no hay otro estudiante con el mismo numero de identificacion agreguelo a la lista */
        listaEstudiantes.add(estudiante);
    }

    private boolean verificarNumeroIdentificacion(String numeroIdentificacion) { //*hace una excepcion y crea un metodo que no hay en el lenguaje propio. Este metodo verifica que no haya igualdad en numeros de identificacion en un estudiante que esta en la lsta de un curso */
       boolean existe  = false;
        for (Estudiante estudiante : listaEstudiantes){
            if(estudiante.numeroIdentificacion().equals(numeroIdentificacion)){
                existe = true;
            }
        }
       return existe;
    }

}
