/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

import java.util.Arrays;
import java.util.Comparator;

public class Contenedor<T extends Comparable<T>> {
    
    private T[] contenedor;
    
    public Contenedor (T[] tabla) {
        contenedor = Arrays.copyOf(tabla, 0);
    }

    public void insertarAlFinal (T obj) {
        contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
        contenedor[contenedor.length-1] = obj;
    }
    
    public void insertarAlPrincipio (T obj) {
        contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
        //System.arraycopy(contenedor, 0, contenedor, 1, contenedor.length-1);
        for (int i=contenedor.length-2; i>=0; i--) {
            contenedor[i+1]=contenedor[i];
        }
        contenedor[0] = obj;
    }
    
    public T extraerDelFinal () {
        T obj = null;
        
        if (contenedor.length > 0 ) {
            obj = contenedor[contenedor.length-1];
            contenedor = Arrays.copyOf(contenedor, contenedor.length-1);
        }
        
        return obj;
    }
    
    public T extraerDelPrincipio () {
        T obj = null;
        
        if (contenedor.length > 0 ) {
            obj = contenedor[0];
            //contenedor = Arrays.copyOfRange(contenedor, 1, contenedor.length);
            for (int i=1; i<contenedor.length; i++) {
                contenedor[i-1]=contenedor[i];
            }
            contenedor = Arrays.copyOf(contenedor, contenedor.length-1);
        }
        
        return obj;
    }
    
    public void ordenar() {
        Arrays.sort(contenedor);
    }
    
    public void ordenar(Comparator<T> comp) {
        Arrays.sort(contenedor,comp);
    }
    
    @Override
    public String toString() {
        return Arrays.deepToString(contenedor);
    }
}
