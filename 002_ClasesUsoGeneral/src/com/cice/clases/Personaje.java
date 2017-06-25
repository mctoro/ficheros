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
public class Personaje {
    
    String nombre;
    int vida;
    boolean hacerMagia;
    
    public void caminar(){
        System.out.println("Estoy caminando");
    }
    public void detenerse(){
        System.out.println("Me paro");
    }
    public void correr(){
        System.out.println("voy corriendo!");
    }
    public void saltar(){
        System.out.println("voy a saltar!");
    }
    
    public void setNombre(String name){
    nombre = name;
    }
}
