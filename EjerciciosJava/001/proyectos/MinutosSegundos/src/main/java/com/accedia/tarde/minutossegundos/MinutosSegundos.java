/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.minutossegundos;

/**
 * Dado un número de minutos, conviertelos a segundos y muestralos por pantalla.
 * 
 * @author Juanma
 */
public class MinutosSegundos {

    public static void main(String[] args) {
        int minutos = 120;
        int segundos;
        
        segundos = minutos * 60;
        
        System.out.printf("%d minutos son %d segundos.\n",minutos,segundos);
    }
}
