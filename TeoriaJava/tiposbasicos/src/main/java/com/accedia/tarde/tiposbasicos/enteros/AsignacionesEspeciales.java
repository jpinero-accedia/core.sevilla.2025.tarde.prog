/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.enteros;

/**
 *
 * @author Tarde Juanma
 */
public class AsignacionesEspeciales {
    public static void main (String[] args) throws Exception {
        // variables
        int num1;
        int num2;
        
        // asignacion "normal"
        System.out.println("\n====> EJEMPLO ASIGNACION \"normal\"");
        num1 = 3;
        num2 = 8;
        
        System.out.println("N1: " + num1); // Dara 3
        System.out.println("N2: " + num2); // Data 8
        

        // Asignación con suma
        System.out.println("\n====> EJEMPLO ASIGNACION SUMA");
        num2 = 8;
        
        num2 += 3;
        
        System.out.println("N2: " + num2); // Dara 11
        
        System.out.println("---- es igual a...");
        num2 = 8;
        
        num2 = num2 + 3;
        
        System.out.println("N2: " + num2); // Dara 11
        
        // Asignación con resta
        System.out.println("\n====> EJEMPLO ASIGNACION RESTA");
        num2 = 8;
        
        num2 -= 3;
        
        System.out.println("N2: " + num2); // Dara 5
        
        System.out.println("---- es igual a...");
        num2 = 8;
        
        num2 = num2 - 3;
        
        System.out.println("N2: " + num2); // Dara 5
        
        // Asignación con multiplicacion
        System.out.println("\n====> EJEMPLO ASIGNACION MULTIPLICACION");
        num2 = 8;
        
        num2 *= 2;
        
        System.out.println("N2: " + num2); // Dara 16
        
        System.out.println("---- es igual a...");
        num2 = 8;
        
        num2 = num2 * 2;
        
        System.out.println("N2: " + num2); // Dara 16
        
        // Asignación con division
        System.out.println("\n====> EJEMPLO ASIGNACION DIVISION");
        num2 = 8;
        
        num2 /= 2;
        
        System.out.println("N2: " + num2); // Dara 4
        
        System.out.println("---- es igual a...");
        num2 = 8;
        
        num2 = num2 / 2;
        
        System.out.println("N2: " + num2); // Dara 4
        
        // Asignación con modulo
        System.out.println("\n====> EJEMPLO ASIGNACION MODULO");
        num2 = 9;
        
        num2 %= 2;
        
        System.out.println("N2: " + num2); // Dara 1
        
        System.out.println("---- es igual a...");
        num2 = 9;
        
        num2 = num2 % 2;
        
        System.out.println("N2: " + num2); // Dara 1
    }
}
