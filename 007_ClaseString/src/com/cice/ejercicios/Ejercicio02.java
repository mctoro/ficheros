/*
 * dada una cadena vamos a contar el numero de vocales que contiene
 */
package com.cice.ejercicios;

/**
 *
 * @author Miguel
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Esto es una cadena de caracteres";
        cadena = cadena.toLowerCase();
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
             
       switch(cadena.charAt(i)){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               contador = contador + 1; 
            }

        }
        System.out.println("Numero de vocales encontradas: " + contador);
    }

}
