/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

/**
 *
 * @author Miguel
 */
public class Coche {
    // atributos locales de la clase (caracteristicas de la clase
    
    String matricula;
    String modelo;
    int potencia;
    String color;
    
    // metodos
    public void pintarInformacion(){
        
        
        System.out.println("Información del coche");
        System.out.println("=====================");
        System.out.println("Matricula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Color: " + color);
    
    }
    
    
    
    
    
}
