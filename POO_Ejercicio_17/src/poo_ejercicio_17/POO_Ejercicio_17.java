/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_17;

/**
 *
 * @author Isabel Higuita Giraldo
 */

/**
 * EJERCICIO PROPUESTO NO.17
 * 
 * Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
 * de la circunferencia.
 */

public class POO_Ejercicio_17 {

    public static void main(String[] args) {
        double radio, area, longitud;

        radio = 5;
        area = Math.PI * Math.pow(radio,2);
        longitud = 2 * Math.PI * radio;

        System.out.println("El radio del circulo elegido es: " + radio);
        System.out.println("El área de un circulo con radio " + radio + " es igual a " + area);
        System.out.println("La longitud de circunferencia de un circulo con radio " + radio + " es igual a " + longitud);
    }
    
}
