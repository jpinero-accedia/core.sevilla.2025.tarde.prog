/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.cuentabancaria;

/**
 *
 * @author Tarde Juanma
 */
public class CuentaBancaria {
    // Atributos
    /**
     * Nombre del titular de la cuenta bancaria
     */
    public String titular;
    
    /**
     * Saldo disponible en la cuenta bancaria
     */ 
    public double saldo;
    
    // Métodos
    /**
     * Ingresa la cantidad indicada
     * @param cantidad cantidad a ingresar
     */
    public void depositar (double cantidad) {
        this.saldo += cantidad;
    }
    
    /**
     * Retira la cantidad especificada del saldo, solo sí hay saldo
     * disponible
     * @param cantidad cantidad a retirar
     */
    public void retirar (double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
        }
    }
    
    /**
     * Muestra la información del titular y el saldo
     */
    public void mostrar () {
        System.out.printf(
                "Titular: %s\nSaldo: %f\n",
                this.titular,
                this.saldo
        );
    }
    
    /**
     * Transfiere una cantidad a otra cuenta bancaria, sólo si hay
     * saldo disponible.
     * @param destino la otra cuenta bancaria
     * @param cantidad la cantidad a ingresar
     * @return un booleano indicando si se ha transferido la cantidad
     */
    public boolean transferir (CuentaBancaria destino, double cantidad) {
        boolean transferido = false;
        
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            destino.saldo += cantidad;
            
            transferido = true;
        }
        
        return transferido;
    }
}
