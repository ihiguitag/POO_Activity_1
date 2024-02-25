/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_14;

/**
 *
 * @author Isabel Higuita Giraldo
 */

/**
 * EJERCICIO PROPUESTO NO.14
 * 
 * Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.
 */

public class POO_Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double numero, cuadrado, cubo;

        numero = 5;
        cuadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);

        System.out.println("El número elegido es: " + numero);
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
    
}
