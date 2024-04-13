package co.edu.uniquindio.poo; //Se declara el paquete porque todo archivo tiene una ruta //namespace - ruta de la clase 

/*
 * Clase circulo
 */

public class Circulo extends FiguraGeometrica {  
    private final double radio; 
    /*
     * Constructor de la clase circulos
     */
    public Circulo (double radio){
        this.radio = radio;
    }

    /*
     * Metodo get de radio
     */
    public double getRadio (){
        return radio;
    }

    /*
     * Metodo set de radio
     */
    public double setRadio (){
        return radio;
    }
    /*
     * Metodo para calcular el area de un circulo
     */
    @Override
    public double calcularArea (){
        return Math.PI * Math.pow(radio, 2);
    }
}

//una clase puede tener varios constructores//
//Math es una clase que ya tiene java, es estatico//
//Todas las clases de tipo excepcion se heredan de throwable//

