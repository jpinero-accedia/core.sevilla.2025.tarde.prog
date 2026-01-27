/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herenciarpg;

import herenciarpg.personajes.Arquero;
import herenciarpg.personajes.Guerrero;
import herenciarpg.personajes.Mago;
import herenciarpg.personajes.Personaje;

/**
 *
 * @author Tarde Juanma
 */
public class App {

    public static void main(String[] args) throws Exception {
        Personaje p = new Arquero("Luis");
        System.out.println(p.toString());
        p.mostrarEstado();
        
        Personaje p2 = new Guerrero("Marta");
        p2.mostrarEstado();
        
        Personaje p3 = new Mago("Manuel");
        p3.mostrarEstado();

        System.out.println("**************\n");
        
        try {
            p.ataca(p2);
            p2.mostrarEstado();
            
            //p.metodoProblematico();
            
            p3.ataca(p2);
            p2.mostrarEstado();
            p3.ataca(p2);
            p2.mostrarEstado();
            p3.ataca(p2);
            p2.mostrarEstado();
            p3.ataca(p2);
            p2.mostrarEstado();
            p3.ataca(p2);
            p2.mostrarEstado();
            p3.ataca(p2);
            p2.mostrarEstado();
            p3.ataca(p2);
            p2.mostrarEstado();

            p3.ataca(p2);
            p2.mostrarEstado();


            p2.ataca(p3);
            p3.mostrarEstado();
        }
        catch (RPGException e) {
            System.err.println("ERROR: " + e);
        }
   }
}
