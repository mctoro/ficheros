/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.clases.Personaje;

/**
 *
 * @author Miguel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje prota = new Personaje();
        
        String nombre = "Miguel";
        
        prota.setNombre(nombre);
       
        
        prota.caminar();
        prota.correr();
        prota.caminar();
        prota.saltar();
        prota.detenerse();
        
        
    }
    
}
