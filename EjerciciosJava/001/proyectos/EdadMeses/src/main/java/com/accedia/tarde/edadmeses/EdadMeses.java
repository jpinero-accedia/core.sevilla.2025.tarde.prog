/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.edadmeses;

/**
 *
 * @author Tarde Juanma
 */
public class EdadMeses {

    public static void main(String[] args) {
        int anyos, meses, dias, horas;
        
        anyos = 43;
        meses = anyos * 12;
        dias = anyos * 365;
        horas = dias * 24;
        
        System.out.printf(
            """
            %d años son...
                        %d meses
                        %d dias
                        %d horas
            """,
            anyos,
            meses,
            dias,
            horas
        );
    }
}
