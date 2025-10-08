/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.decimales;


/**
 *
 * @author Tarde Juanma
 */
public class AreaTriangulo {
    public static void main(String[] args) throws Exception {
        // === VARS ===
        int    ladoA = 9;
        int    ladoB = 3;
        double area  = 0;
        
        // === PROG ===
        area = (ladoA * ladoB) / 2.0;
        
        // === SALIDA ===
        System.out.println("El area del triangulo es: " + area);
    }
}
