/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.notas_switch;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class DiaSemanaSwitch {

    public static void main(String[] args) {
        int dia=0;
        String diaSemana="";
        
        // Recoger un numero por teclado
        System.out.print("Introduzca un numero del 1 al 7.\n > ");
        
        Scanner scan = new Scanner(System.in);
        dia = scan.nextInt();
        
        System.out.println("");
        
        // Operar con el dia
        switch(dia) {
            case 7:
                diaSemana="Domingo";
                break;
            case 6:
                diaSemana="Sábado";
                break;
            case 5:
                diaSemana="Viernes";
                break;
            case 4:
                diaSemana="Jueves";
                break;
            case 3:
                diaSemana="Miércoles";
                break;
            case 2:
                diaSemana="Martes";
                break;
            case 1:
                diaSemana="Lunes";
                break;
            default:
                diaSemana="ERROR";
                break;
        }
        
        System.out.printf("El dia %d es %s.\n",dia,diaSemana);
    }
}
