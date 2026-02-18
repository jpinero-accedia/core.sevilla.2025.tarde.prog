/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prioridad;

/**
 *
 * @author Tarde Juanma
 */
public class ElementoPrioridad implements Comparable<ElementoPrioridad> {
 
    private int prioridad;
    private String elemento;
    
    public ElementoPrioridad(int p, String e) {
        prioridad=p;
        elemento=e;
    }
    
     /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @return the elemento
     */
    public String getElemento() {
        return elemento;
    }
    
    @Override
    public String toString() {
        return String.format("%d: %s",prioridad,elemento);
    }

    @Override
    public int compareTo(ElementoPrioridad otro) {
       //return this.prioridad - otro.prioridad;
       int res;
       
       if (this.prioridad == otro.prioridad) {
           res = 0;
       }
       else if (this.prioridad > otro.prioridad) {
           res = 1;
       }
       else {
           res = -1;
       }
       
       return res;
    }
}
