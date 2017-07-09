/*
 Vamos a diseñar la interface gráfica de la aplicación
 */
package com.cice.userinterface;

import com.cice.logica.Logica;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Interface {
    
    // los hacemos privados (los atributos) ya que solo queremos que se acceda desde dentro de esta clase.
    //atributos locales de la clase
    private Scanner sc = new Scanner(System.in);
    private int opcion;
    private int a;
    private int b;
    private int resultado;
    private Logica logica = new Logica();
    
    //Metodos propios de la clase interface
    public void iniciar(){
    MostrarMenu();
    
    }
    
    

        
    private void MostrarMenu (){
            System.out.println("Bienvenido a la segunda calculadora basica");
            System.out.println("==========================================");
            System.out.println("1- Sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("0- salir");
            System.out.println("==========================================");
            
            getOpcion();
            
   
}

    private void getOpcion(){
    
        do {    
            System.out.println("Selecciona una opción");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 0:
                    System.out.println("Gracias por utilizar la calculadora basica");
                    break;
                case 1:
                    recogidaDatos();
                    resultado = logica.sumar(a, b);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    recogidaDatos();
                    resultado = logica.restar(a, b);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    recogidaDatos();
                    resultado = logica.multiplicar(a, b);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    recogidaDatos();
                    resultado = logica.dividir(a, b);
                    System.out.println("El resultado es: " + resultado);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println("Selecciona una opción dentro de los parámetros");
                    break;
            }
        } while (opcion!=0);
    
    }
private void recogidaDatos(){
    System.out.println("Introduce el primer numero: ");
    a = sc.nextInt();
    System.out.println("Introduce el segundo numero: ");
    b = sc.nextInt();
}     
}
