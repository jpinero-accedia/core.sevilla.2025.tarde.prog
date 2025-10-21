/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.par_impar;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class ParImpar {

    public static void main(String[] args) {
        int numero;
        
        // Pedir numero
        System.out.print("Introduzca un número entero.\n > ");
        
        Scanner scan = new Scanner(System.in);
        numero=scan.nextInt();
        scan.close();
        
        System.out.println("");
        
        // Lógica
        if (numero%2 == 0) {
            System.out.printf("El número %d es PAR.\n",numero);
        }
        else {
            System.out.printf("El número %d es IMPAR.\n",numero);
        }
    }
}
