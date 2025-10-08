/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.cadenas;

/**
 *
 * @author Tarde Juanma
 */
public class Cadenas {
    /*
        LAS CADENAS DE CARACTERES NO SON UN TIPO BASICO
        SON UNA CLASE
    
        Pero se usan tanto, que "casi" se pueden considerar básicos.
    
        Lo único que, al ser objetos de una clase, la variable de tipo String
            almacena la dirección de memoria del objeto.
    
        Con lo cual, la comparación s1==s2 o s1!=s2 no compara el contenido
            de la cadena, si no que nos dice si ambas cadenas son el mismo
            objeto en la misma dirección de memoria o no.
    
        Como caso particular, si creamos objetos cadena con un literal (por
            ejemplo "hola"), Java creara ese objeto en memoria una sola vez,
            por lo que si aparece otro literal exactamente igual, la
               comparacion s1==s2 dara true.
    
        Como son objetos se pueden crear con new, o con metodos que devuelvan
            un String:
    
            // Cadena vacia
            * String s = new String(); 
            
            // Cadena "HOLA", pero este será un nuevo objeto en una nueva
            //      dirección de memoria, porque tiene new.
            * String s = new String("HOLA");
    
            // Cadena formateada
            //  También devuelve siempre un objeto nuevo en una posición nueva
            //      de memoria.
            //  (suponiendo que exista una variable 'nombre' que
            //      sea una cadena)
    
            * String s = String.format("HOLA %s.\n",nombre);
    
        O también se pueden crear con literales, en cuyo caso, si los literales
            coinciden, los objetos serán los mismos (las variables apuntarán
            a la misma zona de memoria y el operador s1==s2 dara true).
    
        Los literales cadena son una cadena de texto entre comillas dobles
            ("HOLA"), pero también pueden ser una triple comilla doble:
    
        """Hola
            que
        tal"""

    */
    
    public static void main (String[] args) throws Exception {
        // Vars
        String s1;
        String s2;
        String s3;
        
        // ======= LITERALES CADENA DIRECTOS =======
        System.out.println("\n=====> 1.- Comparación de literales sin variables");
        
        System.out.printf("""
            La cadena:
               "%s"
            y la cadena:
               "%s"
            son iguales: %b
            """,
        "hola","hola",("hola"=="hola"));
        
        // ======= LITERALES CADENA EN VARIABLES =======
        System.out.println("\n=====> 1.- Comparación de literales con variables");
    }
}
