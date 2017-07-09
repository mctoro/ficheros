/*
 * esta clase definirá las operaciones sobre un circulo.
 * recibirá un argumento de entrada (radio) y debe calcular el area y el perímetro.
 * Atributos locales -> radio, area y perímetro
 * metodos de la clase -> calcularArea, calcularPerimetro
 * formulas -> area = PI*r^2    perimetro = PI*2*radio
 */
package com.cice.figuras;

/**
 *
 * @author Miguel
 */
public class Circulo {
    
    //creamos los atributos locales de la clase
    private double area;
    private double perimetro;
    private double radio;
    
    // ahora crearemos un constructor que inicialice la variable radio
    
    public Circulo(double rad){
    radio = rad;
    }
    //metodos de calculo
    public double calcularArea(){
    area = 0;
    area = (radio*radio)*Math.PI;
    return area;
    }
    public double calcularPerimetro(){
    perimetro = 0;
    perimetro = 2*radio*Math.PI;
    return perimetro;
    }
    
}
