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
    
    private String matricula;
    private String modelo;
    private int potencia;
    private String color;
    
    //Constructores
    public Coche (){
    matricula = "0000asf";
    modelo = "Desconocido";
    potencia = 0;
    color = "desconocido";
    }
    //no podemos ni la cantidad ni tipo de entrada a la hora de repetir un contructor.
    //aquí hemos creado dos constructores "Coche" pero son diferentes.
    public Coche(String mat, String mod, int pot, String col){
    matricula = mat;
    modelo = mod;
    potencia = pot;
    color = col;
    }
    
    // metodos
    //SETTERS
    public void setMatricula(String mat){
    matricula = mat;
    }
    public void setModelo(String mod){
    modelo = mod;
    }    
    public void setPotencia (int pot){
    potencia = pot;
    }
    public void setColor (String col){
    color = col;
    }    
    public void pintarInformacion(){
        
        
        System.out.println("Información del coche");
        System.out.println("=====================");
        System.out.println("Matricula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Color: " + color);
    
    }
    
    
    
    
    
}
