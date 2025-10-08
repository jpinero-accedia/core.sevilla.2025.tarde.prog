/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.caracteres;

/**
 *
 * @author Tarde Juanma
 */
public class Caracteres {
    public static void main(String[] args) throws Exception {
        /*
            Un literal caracter se representa con comillas simples
            
            El tipo de dato se llama "char", ocupa 2 bytes e
                internamente se almacena como un numero entero sin
                signo.
        
            Un char puede ir desde 0 hasta 65_535.
        
            ASCII TABLE: https://www.ascii-code.com/
            ANSI FORMAT CODES: https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797
        */
        
        // VARS
        char c1 = ' ';
        char c2 = ' ';
        char c3 = ' ';
        char c4 = ' ';
        
        int  n1 = 0;
        int  n2 = 0;
        int  n3 = 0;
        int  n4 = 0;
         
        // Imprimir un char
        System.out.println("\n=====> 1. Imprimo un char");
        c1 = 'A';
        System.out.println(c1);
        
        // Un char es un numero, asi que Java hace casting implicito de
        //      char a int
        System.out.println("\n=====> 2. Imprimo un char como entero");
        c1 = 'X';
        n1 = c1;  // casting implicito => n1 será el código numérico de la 'X'
        System.out.println(n1);
        
        // Se puede hacer un casting explicito
        System.out.println("\n=====> 3. Imprimo un char como entero a traves de un casting explicito.");
        c1 = 'Y';
        System.out.println( (int)c1 );
        
        
        // La conversion al reves (de numero a char) necesita un casting explicito
        
        // Para escribir numeros binarios en java se pone 0b delante        
        // Para escribir numeros octales en java se pone 0 delante
        // Para escribir numeros hexadecimales en java se pone 0x delante
        
        // la letra @ es 64 (100 en octal, 40 en hexadecimal, 01000000 en binario)
        System.out.println("\n=====> 3. Paso de int a char e imprimo.");
        n1 = 0b01000000; //binario
        n2 = 0100;       //octal
        n3 = 0x40;       //hexadecimal
        n4 = 64;         //decimal
        
        c1 = (char) n1;
        c2 = (char) n2;
        c3 = (char) n3;
        c4 = (char) n4;
        
        // Esto imprimirá 4 veces un '@', dado que todos los numeros eran el 64
        //    en distintas bases, y el codigo ASCII del 64 es '@'
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        
        // Como los char son numeros, podemos hacer operaciones con ellos
        System.out.println("\n===> 4.- Iterando caracteres para imprimir el abecedario");
        
        for (char c='A'; c<='Z'; c++) {
            System.out.println(c);
        }
        
        // Podemos obtener la letra siguiente
        System.out.println("\n===> 5.- letra siguiente");
        
        c1 = 'r';
        c2 = (char) (c1 + 1);
        
        System.out.println("La letra que va despues de la "+ c1 +" es la "+ c2 +".");
        
        
        
        // Podemos averiguar el intervalo entre mayuscula y minuscula, y con
        //    eso cambiar una minuscula a mayuscula.
        System.out.println("\n===> 6.- de minuscula a mayuscula");
        
        n1 = 'a' - 'A'; // intervalo entre mayuscula y minuscula
        c1 = 'e';
        
        c2 = (char) (c1 - n1); // resto el mismo intervalo a la e
        
        System.out.println("La mayuscula de "+ c1 +" es "+ c2 +".");
    }
}
