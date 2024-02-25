/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_4;

/**
 *
 * @author user
 */

/**
 * EJERCICIO RESUELTO NO.4
 * 
 * A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
 * edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
 * la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
 * 
 */

public class POO_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int EDJUAN = 9;
        int EDALBER, EDANA, EDMAMA;

        EDALBER = (2 * EDJUAN) / 3;
        EDANA = (4 * EDJUAN) / 3;
        EDMAMA = EDALBER + EDANA + EDJUAN;
        
        System.out.println("Las edades son:");

        System.out.println("Alberto: " + EDALBER);
        System.out.println("Juan: " + EDJUAN);
        System.out.println("Ana: " + EDANA);
        System.out.println("Mamá: " + EDMAMA);

    }
    
}
