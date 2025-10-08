/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.paresnones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class Paresnones {

    /*
        Usando la clase escaner y la generacion de un numero aleatorio de
            1 a 6 (como el dado).
    
        Generar un programa que le pida al usuario si quiere con pares o
            impares.
    
        Que despues le pida un numero del 0 al 5.
    
        Genere un numero aleatorio de 0 a 5 para la computadora.
    
        Los suma.
    
        Indica quien gana.
    
    EJ:
        Jugador indica con que juegas:
            (pares|impares): ____
    
        Juagador indica tu tirada:
            (0..5): ____
    
        La computadora juega con _____ y tira un ____ .
        La suma es ____ .
        Ganan pares. / Ganan impares.
        Jugador has ganado!!! / Jugador has perdido !!!    
     */
    
    private static int numeroAleatorio() {
        Random rng = new Random();
        return rng.nextInt(0,5);
    }
    
    private static int pideNumero(Scanner scan) {
        // VARS
        String texto="";
        int numero=0;
        

        // LOGICA
        while (numero == 0) {
            System.out.print("Jugador, indica tu jugada:\n   (0..5): ");
            texto = scan.nextLine().trim();
            System.out.println("");
            
            try {
                numero = Integer.parseInt(texto);
            }
            catch (NumberFormatException e) {}
            
            if (numero<0 || numero>5) {
                numero = 0;
            }
            
            if (numero==0) {
                System.out.println("Entrada errónea. Repite.");
            }
        }
        
        return numero;
    }

    private static String pideParesImpares(Scanner scan) {
        // VARS
        String texto="";
        boolean ok = false;

        // LOGICA
        while (!ok) {
            System.out.print("Jugador, indica con qué juegas:\n   (pares|impares): ");
            texto = scan.nextLine().trim().toLowerCase();
            System.out.println("");

            if (texto.equals("pares") || texto.equals("impares")) {
                ok=true;
            }
            else {
                System.out.println("Entrada errónea. Repite.");
            }
        }
        
        return texto;
    }

    public static void main(String[] args) {
        // VARS
        Scanner scan = new Scanner(System.in);
    }
}
