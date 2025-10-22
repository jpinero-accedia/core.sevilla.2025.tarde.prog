/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class SumaNNumeros {

    public static void main(String[] args) {
        int max=0;
        int suma=0;
        
        // Pedir el max por teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el número superior para hacer la suma: ");
        max = input.nextInt();
        input.close();
        
        // Sumar los números
        suma=0; // la suma inicial tiene que ser 0
        for (int i=1; i <= max; i++) {
            suma = suma + i;
            // suma += i;
        }
        
        // Presentamos el resultado
        System.out.printf("La suma de los numeros de 1 hasta %d es %d.\n",max,suma);

    }
}
