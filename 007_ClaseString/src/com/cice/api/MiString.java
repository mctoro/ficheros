/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.api;

/**
 *
 * @author Miguel
 */
public class MiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena = "mi cadena de caracteres";
        String cadena2 = "mi cadena de caracteres 2";
        int tamaño = cadena.length(); //nos devuelve el tamaño del string
        System.out.println(tamaño);
        
        //.charAt(int pos) -> devuelve el caracter que hay en una posición dada
        char c= cadena2.charAt(1);
        System.out.println(c);
        
        //.indexOf(String cad) -> posiicion de ese caracter o cadena. Si no encuentra devuelve -1
        String mail = "miguel@airb.com";
        System.out.println(mail.indexOf("@"));
        
        //. indexOf(String cad, int pos)-> dada la posición de inicio buscara desde ahí el caracter dado.
        // Si no encuentra devuelve -1
        System.out.println("La letra a se encuentra: " + mail.indexOf("a", 3));
        
        //. lastIndexOf() -> la ultima posición de un caracter en una cadena
        System.out.println("la letra o se encuentra en la ultima posición en: " + mail.lastIndexOf("o"));
        
        //.lastIndexOf (String cad, int pos) -> devolver la ultima posición de un caracter dada una 
        // posición inicial y el caracter buscado.
        System.out.println("la letra e se encuentra en la ultima posición en: " + mail.lastIndexOf("e", 13));
        
        //.sbustring( int pos1, int pos2) -> nos devuelve un string con el trozo de cadena comprendido entre ambas posiciones
        
        System.out.println("el trozo de cadena comprendido es " + mail.substring(3, 13));
        System.out.println(mail.substring(0, mail.indexOf("@")));
        System.out.println(mail.subSequence(mail.indexOf("@"), mail.length()));
        
        //.split(String cad) -> nos devuelve un array con los trozos de cadena resultantes 
        //al usar la cadena de entrada como separador
        
        //.trim () -> elimina los espacios en blanco en una cadena de caracteres al inicio y al final.
        String nuevaCadena = "         asñogibasñiug        ";
        System.out.println(nuevaCadena);
        System.out.println(nuevaCadena.trim());
        
        //.replace(String cad1, String cad2) -> sustituye un trozo de cadena por otro
        System.out.println(nuevaCadena.replace("a", "o"));

        //.valueOf(tipo primitivo Valor) -> nos devuelve un String
        String valor = String.valueOf(123456);
        System.out.println("valor = " + valor);
        
        //PARSEOS -> Clases de envoltura (es una clase que representa al tipo primitivo)
        //Sirve para convertir cadena de caracteres en tipo de dato primitivo
        int numero = Integer.parseInt(valor);
        double decimal = Double.parseDouble(valor);
        System.out.println(numero);
        System.out.println(decimal);
    }
    
}
