/*
 * dado un array de Stings, vamos a mostrar por consola la cadena de mayor numero de caracteres.
 * String[] cadenas = {"java Duke Nuke","Esto es una cadena de gran longitud"}
 */
package com.cice.ejercicios;

/**
 *
 * @author Miguel
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int longitud =0;
        String cadena = "";
        String[] cadenas = {"java Duke Nuke","Esto es una cadena de gran longitud"};
        for (int i=0; i<cadenas.length; i++){
        
            if(cadenas[i].length() > longitud){
            
                longitud = cadenas[i].length();
                cadena = cadenas[i];
            }
        
        }
        System.out.println("la cadena más larga es: " + cadena + " y tiene: " + longitud + " caracteres.");
    }
    
}
