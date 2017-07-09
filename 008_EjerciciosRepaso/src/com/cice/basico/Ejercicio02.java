/* Ejercicio02
 * Declara dos variables X e Y de tipo entero, 2 variables M y N de tipo decimal. Asignales un valor.
 * Pinta por consola todas las operaciones matemáticas que se te ocurran entre ellas.
 */
package com.cice.basico;

/**
 *
 * @author Miguel
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=4;
        int y=2;
        double m=2.1;
        double n=4.8;
        
        System.out.println("el numero x es: " + x);
        System.out.println("El numero y es: " + y);
        System.out.println("El numero m es: " + m);
        System.out.println("El numero n es: " + n);
        
        
        System.out.println("La suma de todos los numeros es: " + (x+y+m+n));
        System.out.println("La resta de todos los numeros es: " + (x-y-m-n));
        System.out.println("La multiplicacion de todos los numeros es: " + (x*y*m*n));
        System.out.println("La división de todos los numeros es: " + (x/y/m/n));
        
    }
    
}
