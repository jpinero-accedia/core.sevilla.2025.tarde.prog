/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.enteros;

/**
 *
 * @author Tarde Juanma
 */
public class CalculaTiempo {

    public static void main(String[] args) {
        /* ======= VARIABLES ========== */

        // El dato de entrada: numero de segundos
        int entrada = 3700;

        // esta variable es temporal para arrastar los resultados
        int res = 0;

        // Variables de salida
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        /* ======= PROGRAMA ========== */
        // inicio
        res = entrada;

        // Calcula segundos
        segundos = res % 60;
  
        // Calcula minutos
        res = res / 60;
        minutos = res % 60;

        // Calcula horas
        res = res / 60;
        horas = res % 60;
        
        // Calcula dias
        dias = res / 24;

        /* ======= SALIDA ========== */
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
