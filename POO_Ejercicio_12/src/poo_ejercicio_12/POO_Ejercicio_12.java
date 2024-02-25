/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_12;

/**
 *
 * @author Isabel Higuita Giraldo
 */

/**
 * EJERCICIO PROPUESTO NO.12
 * 
 * Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
 * retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
 * la retención en la fuente y el salario neto del trabajador. 
 */

public class POO_Ejercicio_12 {

    public static void main(String[] args) {

        double horasSemana, valorHora, porcentajeRete;

        horasSemana = 48;
        valorHora = 5000;
        porcentajeRete = 12.5;

        double salarioBruto = horasSemana * valorHora;
        double retencion = salarioBruto * (porcentajeRete / 100);
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Las horas semanales trabajadas son " + horasSemana + ", con un valor de " + valorHora + " la hora");
        System.out.println("El salario bruto semanal corresponde a " + salarioBruto);
        System.out.println("La retención es de " + retencion + ", en base a un porcentaje de retención de " + porcentajeRete + "%");
        System.out.println("Por lo tanto, el salario neto es de " + salarioNeto);

    }
    
}
