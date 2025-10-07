/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.puntosdistancia;

/**
 *
 * @author Tarde Juanma
 */
public class TestPunto {

    public static void main(String[] args) throws Exception {
        // VARS
        Punto pA = new Punto();
        Punto pB = new Punto();
        double distancia = 0;
        double dx, dy;
        
        // inicializamos los puntos
        pA.x = 2.0;
        pA.y = 3.0;
        
        pB.x = 4.0;
        pB.y = 4.0;
        
        // calculamos la distancia entre cada componente
        dx = pA.x - pB.x;
        dy = pA.y - pB.y;
        
        // elevar al cuadrado las distancias
        dx = Math.pow(dx,2);
        dy = Math.pow(dy,2);
        
        // calcular la distancia total (raiz cuadrada de la suma de los cuadrados)
        distancia = Math.sqrt(dx + dy);
        
        // SALIDA
        System.out.println("La distancia entre los puntos A y B es de " + distancia);
        
    }
}
