/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.notas;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class Notas {

    public static void main(String[] args) {
        Scanner scan;
        double nota=0.0;
        
        System.out.print("Introduce tu nota: ");
        scan = new Scanner(System.in);
        nota = scan.nextDouble();
        System.out.println("");
        scan.close();
        
        if (nota == 10) {
            System.out.printf("La nota %f es sobresaliente.\n",nota);
        }
        else if (nota >= 8) {
            System.out.printf("La nota %f es notable.\n",nota);
        }
        else if (nota >= 6) {
            System.out.printf("La nota %f es bien.\n",nota);
        }
        else if (nota >= 5) {
            System.out.printf("La nota %f es aprobado.\n",nota);
        }
        else {
            System.out.printf("La nota %f es suspenso.\n",nota);
        }
    }
}
