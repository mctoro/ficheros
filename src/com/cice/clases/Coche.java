
package com.cice.clases;

import java.util.Date;

/**
 *
 * @author cice
 */
public class Coche {
    
    //atributos o variables
    //caracteristicas
    String modelo;
    String color;
    String matricula;
    String bastidor;
    int potencia;
    Date fecha;
    boolean isRiding;
    boolean isOn;
    
    //constructora OHL siempre -- SIEMPRE -- se llama como la Clase, en este caso Coche
    public Coche(){
    
    }
    
    //funciones
    //ambitos "publico" "por defecto" "protegido" "privado"
    void acelerar(){
        System.out.println("Estoy acelerando");
    }
    
    void frenar(){
        System.out.println("Estoy frenando");
    }
    
    void arrancar(){
        System.out.println("Arrancando");
    }
    
    void apagar(){
        System.out.println("Ya me apago");
    }
    
}
