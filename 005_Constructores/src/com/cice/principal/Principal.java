/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.clases.Coche;

/**
 *
 * @author Miguel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 Coche coche1 = new Coche();
        System.out.println("Se va a mostrar los valores por defecto");
 coche1.pintarInformacion();
 coche1.setColor("rojo");
 coche1.setMatricula("1234asf");
 coche1.setPotencia(123);
 coche1.setModelo("Altea");
        System.out.println("se va a pintar la información introducida una a una");
 coche1.pintarInformacion();
 
 Coche coche2 = new Coche("2345sfg", "toyota", 121, "azul");
        System.out.println("se va a pintar la información metida en el mismo dato");
 coche2.pintarInformacion();
 
 
    }
    
}
