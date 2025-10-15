/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.conversiontemperatura;

/**
 *
 * @author Tarde Juanma
 */
public class ConversionTemperatura {

    public static void main(String[] args) {
        double celsius = 40.0;
        double farenheit;

        farenheit = (celsius * 1.8) + 32.0;

        System.out.printf(
                "%f grados Celsius son %f grados farenheit.\n",
                celsius,
                farenheit
        );
    }
}
