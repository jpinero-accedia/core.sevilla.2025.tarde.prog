/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.precioiva;

/**
 *
 * @author Tarde Juanma
 */
public class PrecioIva {

    public static void main(String[] args) {
        double precio, precioTotal;
        double iva = 0.21;
        
        precio = 300;
        precioTotal = precio * (1+iva);
        
        System.out.printf(
            "Si el precio es %f, el precio +21%% de IVA es %f.\n",
            precio,
            precioTotal    
        );
    }
}
