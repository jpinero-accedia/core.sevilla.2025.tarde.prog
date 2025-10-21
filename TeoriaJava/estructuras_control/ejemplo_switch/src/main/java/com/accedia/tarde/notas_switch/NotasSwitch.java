/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.notas_switch;

/**
 *
 * @author Tarde Juanma
 */
public class NotasSwitch {

    public static void main(String[] args) {
        // Imaginamos que la nota es un número entero
        // Es decir, que solo se puede sacar: 0,1,2,3,4,5,6,7,8,9,10
        int nota;
        
        /*
        // El código con if-else seria el siguiente
        if (nota == 10) {
            System.out.printf("La nota %d es notable.\n",nota);
        }
        else if (nota >= 8) {
            System.out.printf("La nota %d es notable.\n",nota);
        }
        else if (nota >= 6) {
            System.out.printf("La nota %d es bien.\n",nota);
        }
        else if (nota >= 5) {
            System.out.printf("La nota %d es aprobado.\n",nota);
        }
        else {
            System.out.printf("La nota %d es suspenso.\n",nota);
        }
        */

        nota=6;
        switch (nota) {
            case 10:
                System.out.printf("La nota %d es sobresaliente.\n",nota);
                break;
            case 9:
            case 8:
                System.out.printf("La nota %d es notable.\n",nota);
                break;
            case 7:
            case 6:
                System.out.printf("La nota %d es bien.\n",nota);
                break;
            case 5:
                System.out.println("entro en case 5");
                System.out.printf("La nota %d es aprobado.\n",nota);
                break;
            default:
                System.out.println("entro en case default");
                System.out.printf("La nota %d es suspenso.\n",nota);
                break;
        }
        
        System.out.println("salgo del switch");
    }
}
