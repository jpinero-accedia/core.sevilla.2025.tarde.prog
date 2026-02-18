/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.genericos01;

import java.util.Arrays;

/*
Implementar un método genérico estático que realice la inserción de un objeto
al final de un array, ambos del mismo tipo genérico, que se pasan como
parámetros. Devuelve un nuevo array con el resultado de la inserción.
 */
public class App {

    public static void main(String[] args) {
        Integer[] misnumeros = new Integer[3];
        misnumeros[0] = 10;
        misnumeros[1] = 400;
        misnumeros[2] = 36;
        
        Integer[] nuevatabla = copiaGenerico(56, misnumeros);
        imprimeTablaTipoEntero(nuevatabla);
    }
    
    public static void imprimeTablaString(Object[] tabla) {
        String s;
        
        for ( Object obj : tabla ) {
            s = (String) obj;
            System.out.println(s);
        }
    }
    
    public static void imprimeTablaEntero(Object[] tabla) {
        Integer i;
        
        for ( Object obj : tabla ) {
            i = (Integer) obj;
            System.out.println(i);
        }
    }
    
    public static void imprimeTablaTipoEntero (Integer[] tabla) {
        for (Integer i : tabla) {
            System.out.println(i);
        }
    }
    
    public static void imprimeTablaTipoString (String[] tabla) {
        for (String s : tabla) {
            System.out.println(s);
        }
    }
    
    public static Object[] copiaObject (Object obj, Object[] tabla) {
        Object[] nuevo = Arrays.copyOf(tabla, tabla.length + 1);
        nuevo[tabla.length] = obj;
        return nuevo;
    }
    
    public static <T> T[] copiaGenerico (T obj, T[] tabla) {
        T[] nuevo = Arrays.copyOf(tabla, tabla.length + 1);
        nuevo[tabla.length] = obj;
        return nuevo;
    }
}
