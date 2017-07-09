/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.logica;

import com.cice.persona.Persona;

/**
 *
 * @author Miguel
 */
public class Logica {
    
    public static void calcularIMC(Persona persona){
    //tendria que recuperar peso y altura y hacer el calculo
    //peso(kg)/altura^2(m).
    
    double pesoPersona = persona.getPeso();
    double alturaPersona = persona.getAltura();
    
    double imc = (pesoPersona/(alturaPersona*alturaPersona));
    
        if (imc<16) {
            System.out.println("Estás MUY por debajo del IMC recomendado por la OMS: " + imc);
        }else if (imc< 18.5){
            System.out.println("Estás por debajo del IMC recomendado por la OMS: " + imc);
        }else if (imc< 25){
        System.out.println("Estás en tu IMC recomendado por la OMS: " + imc);
        }else if (imc< 30){
        System.out.println("Estás por encima del IMC recomendado por la OMS: " + imc);
        }else{
        System.out.println("Estás MUY por encima del IMC recomendado por la OMS: " + imc);
        }
    
    }
    
}
