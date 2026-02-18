/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prioridad;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Tarde Juanma
 */
public class Prioridad {

    public static void main(String[] args) {
       main03();
    }
    
    public static void main01() {
        PriorityQueue<ElementoPrioridad> pq = new PriorityQueue<>();
        ElementoPrioridad ep;
        
        pq.offer(new ElementoPrioridad(60,"Hola"));
        pq.offer(new ElementoPrioridad(60,"Hola 2"));
        pq.offer(new ElementoPrioridad(10,"otro Hola"));
        pq.offer(new ElementoPrioridad(10,"otro Hola 2"));
        pq.offer(new ElementoPrioridad(60,"Hola 3"));
        
        while (! pq.isEmpty() ) {
            ep = pq.poll();
            System.out.println(ep);
        }
    }
    
    public static void main02() {
        PriorityQueue<ElementoPrioridad> pq = new PriorityQueue<>(
            (o1,o2) -> {
                // o2.getPrioridad() - o1.getPrioridad()
                int res;
                
                if ( o1.getPrioridad() == o2.getPrioridad() ) {
                    res = 0;
                }
                else if ( o1.getPrioridad() > o2.getPrioridad() ) {
                    res = -1;
                }
                else {
                    res = 1;
                }
                
                return res;
            }
        );
        ElementoPrioridad ep;
        
        pq.offer(new ElementoPrioridad(60,"Hola"));
        pq.offer(new ElementoPrioridad(60,"Hola 2"));
        pq.offer(new ElementoPrioridad(10,"otro Hola"));
        pq.offer(new ElementoPrioridad(10,"otro Hola 2"));
        pq.offer(new ElementoPrioridad(60,"Hola 3"));
        
        while (! pq.isEmpty() ) {
            ep = pq.poll();
            System.out.println(ep);
        }
    }
    
     public static void main03() {
        PriorityQueue<ElementoPrioridad> pq = new PriorityQueue<>(new OrdenInverso());
        ElementoPrioridad ep;
        
        pq.offer(new ElementoPrioridad(60,"Hola"));
        pq.offer(new ElementoPrioridad(60,"Hola 2"));
        pq.offer(new ElementoPrioridad(10,"otro Hola"));
        pq.offer(new ElementoPrioridad(10,"otro Hola 2"));
        pq.offer(new ElementoPrioridad(60,"Hola 3"));
        
        while (! pq.isEmpty() ) {
            ep = pq.poll();
            System.out.println(ep);
        }
        
        System.out.println(pq.size());
    }
     
    public static void main04() {
        PriorityQueue<ElementoPrioridad> pq = new PriorityQueue<>();
        ElementoPrioridad ep;
        
        pq.offer(new ElementoPrioridad(60,"Hola"));
        pq.offer(new ElementoPrioridad(60,"Hola 2"));
        pq.offer(new ElementoPrioridad(10,"otro Hola"));
        pq.offer(new ElementoPrioridad(10,"otro Hola 2"));
        pq.offer(new ElementoPrioridad(60,"Hola 3"));
        
        Iterator<ElementoPrioridad> it = pq.iterator();
        
        while ( it.hasNext() ) {
            ep = it.next();
            System.out.println(ep);
        }
        
        System.out.println(pq.size());
    }
    
    
}
