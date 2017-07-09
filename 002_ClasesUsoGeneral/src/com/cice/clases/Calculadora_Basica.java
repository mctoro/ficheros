/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;


import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Calculadora_Basica {
    //Atributos --> caracteristicas de la aplicación
    //Variables locales (GLOBALES PARA TODA LA CLASE)

    Scanner sc = new Scanner (System.in);
    
    //Funciones de la calculadora
    //1º MostrarMenu
    //2º Sumar
    //3º Restar
    //4º Multiplicar
    //5º Dividir
    int a;
    int b;
    
    
    
    
public void MostrarMenu(){

    // variables internas del metodo (SOLO SON ACCESIBLES DESDE DENTRO DEL METODO)
    int opcion;
    
    System.out.println("Primera Calculadora");
    System.out.println("===================");
    
    do{
        System.out.println("1- Sumar");
        System.out.println("2- Restar");        
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir"); 
        System.out.println("0- Salir");
        System.out.println("===================");
        System.out.print("Selecciona tu opción ");
        
        opcion = sc.nextInt();
    
        switch(opcion){
            case 1: 
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            default:
                System.out.println("La opción seleccionada no es valida");
        }
        
    }while(opcion!=0);
    
   
}   
private void recogidaDatos(){
    System.out.println("Introduce el primer numero: ");
    a = sc.nextInt();
    System.out.println("Introduce el segundo numero: ");
    b = sc.nextInt();
} 
private void sumar(){
 recogidaDatos();
    System.out.println("La suma de ambos numeros es: " + (a+b));
}

private void restar(){
recogidaDatos();
    System.out.println("La resta de ambos numeros es: " + (a-b));
}
private void multiplicar(){
recogidaDatos();
    System.out.println("La multiplicación de ambos numeros es: " + (a*b));
}
private void dividir(){
recogidaDatos();
    System.out.println("La división de ambos numeros es: " + (a/b));
}

    
}
    
