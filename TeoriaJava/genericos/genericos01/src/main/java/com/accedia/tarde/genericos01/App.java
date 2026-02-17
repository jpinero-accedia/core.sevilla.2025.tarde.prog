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
        misnumeros[0] = 1;
        misnumeros[1] = 2;
        misnumeros[2] = 3;
        
        Integer[] res = copiaGenerico(6, misnumeros);
        System.out.println(Arrays.toString(res));
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
