/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.lectura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class lecturaFicheros {
    
    public static void main(String[] args) throws IOException {
        
        String contenido ="";
        
        int c;
        
        
        try {
            FileReader fr = new FileReader("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo.txt");
            
            c = fr.read();
            while (c!=-1) {                
                contenido+= (char)c;
                c = fr.read();
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lecturaFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("El contenido del fichero Hola Mundo es: " + contenido);
        
    }
    
}
