/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.decimales;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class AreaTrianguloScanner {
    
    
    private static double pideNumeroDecimal(Scanner scan, String lado) {
        // === VARS ===
        String linea;
        double numero=0;
        
        // le digo al usuario que quiero un numero
        System.out.print("Introduce un numero decimal (lado "+ lado +"): ");
        
        // leo la siguiente linea
        linea = scan.nextLine();
        
        // imprimo un intro
        System.out.println("");
        
        // limpio los espacios de la linea
        linea = linea.trim();
        
        // parseo la linea como double
        numero = Double.parseDouble(linea);
        
        // devuelvo el numero
        return numero;
    }
    
    private static double pideNumeroDecimalCompacto(Scanner scan) {
       return Double.parseDouble(scan.nextLine().trim());
    }
    
    public static void main(String[] args) throws Exception {
        // === VARS ===
        double ladoA = 0;
        double ladoB = 0;
        double area  = 0;
        Scanner miescaner = new Scanner(System.in);
        
        // === PIDE DATOS ===
        ladoA = pideNumeroDecimal(miescaner,"A");
        ladoB = pideNumeroDecimal(miescaner,"B");
        
        // === PROG ===
        area = (ladoA * ladoB) / 2.0;
        
        // === cierro el escanner ===
        miescaner.close();
        
        // === SALIDA ===
        System.out.println("El area del triangulo es: " + area);
    }
}
