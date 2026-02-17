/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package genericos;

import java.util.Comparator;

/**
 *
 * @author Tarde Juanma
 */
public class App {

    public static void main(String[] args) {
        Contenedor<Integer> con = new Contenedor<>(new Integer[0]);
        con.insertarAlFinal(4);
        con.insertarAlFinal(1);
        con.insertarAlFinal(8);
        con.ordenar();
        System.out.println(con);
        
        
        Comparator<Integer> comp = new OrdenInversoInteger();
        
        con.ordenar(comp);
        //con.ordenar((e,o)->o-e);
        System.out.println(con);
    }
}
