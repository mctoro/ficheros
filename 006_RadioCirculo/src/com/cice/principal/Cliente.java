/*
 * esta clase se va a encargar de crear el objeto circulo, inicializandolo con el radio
 * y pintará los resultados del area y perímetro
 */
package com.cice.principal;

import com.cice.figuras.Circulo;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area;
        double perimetro;
        double radio;

        do {
            System.out.println("Bienvenido a la calculadora de perimetro y area de un circulo");
            System.out.println("=============================================================");
            System.out.println("Introduce el radio del ciruclo");
            Scanner sc = new Scanner(System.in);
            radio = sc.nextDouble();

            //Creamos el circulo
            Circulo circulo = new Circulo(radio);

            //Calculamos el area y el perímetro
            area = circulo.calcularArea();
            perimetro = circulo.calcularPerimetro();
            if (radio != 0) {
                System.out.println("El area del circulo es: " + area);
                System.out.println("El perimetro del circulo es: " + perimetro);
            }
        } while (radio != 0);
    }

}
