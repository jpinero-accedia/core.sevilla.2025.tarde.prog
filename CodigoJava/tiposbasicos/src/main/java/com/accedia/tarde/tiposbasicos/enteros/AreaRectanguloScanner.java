/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.enteros;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class AreaRectanguloScanner {
    public static void main (String[] Args) throws NumberFormatException {
        /* ======= VARIABLES ========== */
        Scanner scan;
        String dato;
        int ladoA;
        int ladoB;
        int area;
        
        /* ======= PEDIR DATOS POR TECLADO ========== */
        scan = new Scanner(System.in);
        
        // =====> ladoA        
        // cojo el dato por teclado
        System.out.print("Introduce el valor del alto:\n> ");
        dato = scan.nextLine();
        System.out.println("");
        
        // limpio los posibles espacios que tenga el dato
        dato = dato.trim();
        
        // paso el dato a un numero entero
        ladoA = Integer.parseInt(dato);
        
        
        // =====> ladoB
        // cojo el dato por teclado
        System.out.print("Introduce el valor del ancho:\n> ");
        ladoB = Integer.parseInt(scan.nextLine().trim());
        System.out.println("");
        
        // cierro el scanner
        scan.close();     
        
        /* ======= PROGRAMA ========== */
        area = ladoA * ladoB;

        /* ======= SALIDA ========== */
        System.out.println("El area del rectangulo es: " + area);
    }
}
