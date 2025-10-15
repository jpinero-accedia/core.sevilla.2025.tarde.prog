/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.siguientecaracter;

import java.util.Scanner;

/**
 *
 * @author Tarde Juanma
 */
public class SiguienteCaracter {

    public static void main(String[] args) {
        String texto = "";
        char caracter;
        char caracterSig;
        int codigo;

        // Obtenemos una linea de texto
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe un caracter: ");
        texto = scan.nextLine();
        scan.close();

        // Nos quedamos con el primer caracter de la linea de texto
        if (texto.isEmpty()) {
            System.out.println("No has introducido ningun caracter");
        } else {
            caracter = texto.charAt(0);

            // Calculo el siguiente
            codigo = (int) caracter;
            codigo = codigo + 1;
            caracterSig = (char) codigo;

            System.out.printf(
                    "El caracter que va despues de '%c' es el '%c'.\n",
                    caracter,
                    caracterSig
            );
        }
    }

    public static void main1(String[] args) {
        char caracter = 'A';
        char caracterSig;
        int codigo;

        codigo = (int) caracter;
        codigo = codigo + 1;
        caracterSig = (char) codigo;

        System.out.printf(
                "El caracter que va despues de '%c' es el '%c'.\n",
                caracter,
                caracterSig
        );
    }
}
