/*
Vamos a crear en el main del tipo interface
 */
package com.cice.principal;

import com.cice.userinterface.Interface;

/**
 *
 * @author Miguel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Interface userInterface = new Interface();
        userInterface.iniciar();
        
        
    }
    
}
