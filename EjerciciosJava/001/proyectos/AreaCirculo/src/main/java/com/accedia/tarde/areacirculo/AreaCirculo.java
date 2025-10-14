/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.areacirculo;

/**
 *
 * @author Tarde Juanma
 */
public class AreaCirculo {
    public static void main(String[] args) {
        double radio = 8.5;
        double area;
        
        area = Math.PI * Math.pow(radio,2);
        
        System.out.printf("El area de un circulo de radio %f es %f.\n",radio,area);
    }
}
