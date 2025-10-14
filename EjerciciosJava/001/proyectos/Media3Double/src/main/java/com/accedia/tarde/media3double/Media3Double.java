/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.media3double;

/**+
 * Dados 3 números decimales, calcular su media.
 * 
 * @author Juanma
 */
public class Media3Double {

    public static void main(String[] args) {
        double n1=45.89, n2=56.11, n3=34.78;
        double media;
        
        media = ( n1 + n2 + n3 ) / 3.0;
        
        System.out.printf("La media de %f, %f y %f es %f.\n",n1,n2,n3,media);
        System.out.println(media);
    }
}
