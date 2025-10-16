/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.repasoestructuras;

/**
 *
 * @author Tarde Juanma
 */
public class EstructuraIf {

    public static void main(String[] args) {
        boolean hayError = true;
        int numero = 0;

        // Condicionales
        // IF BASICO
        System.out.println("\n===> IF BASICO");
        hayError = true;
        
        // dentro de los parentesis hay una expresion booleana
        if ( hayError ) {
            System.out.println("ERROR");
        }
        
        // IF-ELSE
        System.out.println("\n===> IF-ELSE");
        hayError = true;
        
        // hay dos ramas, una si se cumple la condicion y otra si no
        if (! hayError ) {
            System.out.println("ERROR");
        }
        else {
            System.out.println("NO HAY ERROR");
        }
        
        // IF-ELSEIF-ELSE simulado
        System.out.println("\n====> IF-ELSEIF-ELSE simulado");
        
        // Condicionales anidadas
        
        // Para probar mas de una condicion, metemos if-else dentro de
        //     otros
        
        numero = 100;
        
        if ( numero > 0 ) {
            System.out.printf("El numero %d es positivo.\n", numero);
        }
        else {
            if ( numero < 0) {
                System.out.printf("El numero %d es negativo.\n", numero);
            }
            else {
                System.out.printf("El numero %d es 0.\n", numero);
            }
        }
        
        // IF-ELSEIF-ELSE real
        System.out.println("\n====> IF-ELSEIF-ELSE real");
        
        // Tenemos multiples ramas con condiciones, y al final puede haber un
        //    else para el caso en que ninguna de las condiciones haya sido
        //    verdadera
        //
        // Solo se ejecuta una rama !!!!!!!!!
        // La primera que sea verdadera
        
        numero = 0;
        
        if ( numero > 0 ) {
            System.out.printf("El numero %d es positivo.\n", numero);
        }
        else if (numero < 0) {
            System.out.printf("El numero %d es negativo.\n", numero);
        }
        else {
            System.out.printf("El numero %d es 0.\n", numero);
        }
    }
    
}
