/*
 * Ejercicio 01
 * Programa una aplicación que realice lo siguiente:
 * Declara 3 variables, un entero, un decimal y un caracter y asignales un valor correcto
 * Pinta por consola el valor de cada variable concatenando con el nombre de cada una.
 * Pinta por consola los calculos del (entero + el decimal) y (decimal - entero)
 */
package com.cice.basico;

/**
 *
 * @author Miguel
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero = 2;
        double decimal = 3.2;
        char caracter = 'd';
        
        System.out.println("El valor " + "entero" + " es: " + entero);
        System.out.println("El valor " + "decimal" + "es: " + decimal);
        System.out.println("El caracter introducido es: " + caracter);
        
        System.out.println("La suma del entero " + entero + " y el decimal es: " + (entero+decimal));
        System.out.println("La resta del decimal " + decimal + " menos el entero es: " + (decimal-entero));
    }
    
}
