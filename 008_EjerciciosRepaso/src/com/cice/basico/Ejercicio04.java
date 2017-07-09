/*
 * Declara 4 variables de tipo entero y asignales un valor. Inmediatamente despues haz
 * las operaciones necesarias para que B tome el valor de C, C el valor de A, A tome el valor de D y 
 * D tome el valor de B.
 */
package com.cice.basico;

/**
 *
 * @author Miguel
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A=4;
        int B=24;
        int C=3;
        int D=25;
        int AUXILIAR;
        

        
        
        System.out.println("el valor inicial de A es: " + A);
        System.out.println("el valor inicial de B es: " + B);
        System.out.println("el valor inicial de C es: " + C);
        System.out.println("el valor inicial de D es: " + D);
        
        System.out.println("==============================");
        
        AUXILIAR = D;
        D = B;
        B = C;
        C = A;
        A = AUXILIAR;
        System.out.println("ahora el valor de A es: " + A);
        System.out.println("ahora el valor de B es: " + B);
        System.out.println("ahora el valor de C es: " + C);
        System.out.println("ahora el valor de D es: " + D);
    }
    
}
