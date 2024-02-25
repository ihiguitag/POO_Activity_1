/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_5;

/**
 *
 * @author user
 */

/**
 * EJERCICIO RESUELTO NO.5
 * 
 * Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
 * 
 * INICIO
 *  SUMA = 0
 *   X = 20
 *  SUMA = SUMA + X
 *  Y = 40
 *  X = X + Y ** 2
 *  SUMA = SUMA + X / Y
 *  ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
 * FIN_INICIO
 */

public class POO_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double SUMA, X, Y;

        SUMA = 0;
        X = 20;
        Y = 40;

        SUMA = SUMA + X;
        X = X + Math.pow(Y,2);
        SUMA = SUMA + (X / Y);

        System.out.println("El valor de la suma es: " + SUMA);

    }
    
}
