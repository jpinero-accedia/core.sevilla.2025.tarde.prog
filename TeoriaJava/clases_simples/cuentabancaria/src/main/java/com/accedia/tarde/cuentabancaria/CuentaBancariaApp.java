/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.cuentabancaria;

/**
 *
 * @author Tarde Juanma
 */
public class CuentaBancariaApp {

    public static void main(String[] args) {
        /*
            1. Crea dos cuentas con distintos titulares y saldos.
            2. Realiza varias operaciones (depositar, retirar, transferir).
            3. Muestra los saldos después de cada operación.
        */
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
        cuenta1.titular = "Julio";
        cuenta1.saldo = 0.00;
        
        cuenta2.titular = "Luana";
        cuenta2.saldo = 0.00;
        
        // Mostrar
        cuenta1.mostrar();
        cuenta2.mostrar();
        System.out.println();
        
        // Depositar
        cuenta1.depositar(100.00);
        cuenta1.mostrar();
        System.out.println();
        
        // retirar
        cuenta1.retirar(10.00);
        cuenta1.mostrar();
        System.out.println();
        
        // transferir
        cuenta1.transferir(cuenta2, 50.00);
        cuenta1.mostrar();
        cuenta2.mostrar();
        System.out.println();
    }
}
