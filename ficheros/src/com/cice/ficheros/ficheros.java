/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ficheros {
    
    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo.txt");
            
            fw.write("Hola Mundo");

            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
