/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.decimales;

/**
 *
 * @author Tarde Juanma
 */
public class TruncarNDecimales {
    public static void main (String[] args) throws Exception {
        double d1 = 4.76345;
        double d2;
        int numDec = 1;
        double pot10;
        
        pot10 = Math.pow(10,numDec);
        
        d2 = ((int)(d1 * pot10)) / pot10;
        
        System.out.println(d1);
        System.out.println(d2);
        
        
    }
}
