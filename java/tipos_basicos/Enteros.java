/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.tiposbasicos;

/**
 *
 * @author Juanma
 */
public class Enteros {
    public static void main(String[] args) {
        // VARIABLES
        int res;
        int v1=0;
        int v2=0;

        // IMPRIMIR VALORES
        v1 = 10;
        v2 = 7;
        
        System.out.println("El primer numero es: " + v1);
        System.out.println("El segundo numero es: " + v2);
        
        

        // ==============================
        // OPERADORES ARITMETICOS
        
        // suma, resta, multiplicacion y division
        res = v1 + v2;
        System.out.println("La suma es: " + res);
        
        res = v1 - v2;
        System.out.println("La resta es: " + res);
        
        res = v1 * v2;
        System.out.println("La multiplicacion es: " + res);
        
        res = v1 / v2;
        System.out.println("La division es: " + res);
        
        // modulo
        res = v1 % v2;
        System.out.println("El módulo es: " + res);
    }
}
