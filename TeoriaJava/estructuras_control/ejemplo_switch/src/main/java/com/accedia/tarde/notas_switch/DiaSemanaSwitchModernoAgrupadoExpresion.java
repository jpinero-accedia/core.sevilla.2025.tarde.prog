/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.notas_switch;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class DiaSemanaSwitchModernoAgrupadoExpresion {

    public static void main(String[] args) {
        // Nuetsro codigo quiere ver si es fin de semana o no
        
        int dia=0;
        String esFSD="";
        
        // Recoger un numero por teclado
        System.out.print("MODERNO EXPRESION: Introduzca un numero del 1 al 7.\n > ");
        
        Scanner scan = new Scanner(System.in);
        dia = scan.nextInt();
        
        System.out.println("");
        
        // Operar con el dia
        esFSD = switch (dia) {
            case 7, 6 -> "ES Fin de Semana";
            case 5, 4, 3, 2, 1 -> "NO ES Fin de Semana";
            default -> "ES ERROR";
        };
        
        System.out.printf("El dia %d %s.\n",dia,esFSD);
    }
}
