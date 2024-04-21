package co.edu.uniquindio.poo; //Se declara el paquete porque todo archivo tiene una ruta //namespace - ruta de la clase 

/*
 * Clase circulo
 */

public class Circulo extends FiguraGeometrica {  
    private final double radio; 

    /*
     * Método constructor de la clase Circulo
     */
    public Circulo (double radio){
        assert radio > 0;
        this.radio = radio;
    }

    /*
     * Método para obtener el valor radio de un circulo
     */
    public double getRadio (){
        return radio;
    }

    /*
     * Método para calcular el area de un circulo
     */
    @Override
    public double calcularArea (){
        return Math.PI * Math.pow(radio, 2);
    }
}

//una clase puede tener varios constructores//
//Math es una clase que ya tiene java, es estatico//
//Todas las clases de tipo excepcion se heredan de throwable//

