/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prioridad;

import java.util.Comparator;

/**
 *
 * @author Tarde Juanma
 */
public class OrdenInverso implements Comparator<ElementoPrioridad> {

    @Override
    public int compare(ElementoPrioridad o1, ElementoPrioridad o2) {
       int res;
       
       if (o1.getPrioridad() == o2.getPrioridad()) {
           res = 0;
       }
       else if (o1.getPrioridad() > o2.getPrioridad()) {
           res = -1;
       }
       else {
           res = 1;
       }
       
       return res;
    }
}
