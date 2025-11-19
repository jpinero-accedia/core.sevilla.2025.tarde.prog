/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.ejemplousuario;

/**
 *
 * @author Tarde Juanma
 */
public class UsuarioApp {

    public static void main(String[] args) {
        
        Usuario u1 = new Usuario("Irene");
        
        u1.setNombre("Juan");
        System.out.println(u1.getNombre());
        /*
        Usuario u2 = new Usuario();
        u2.setNombre("Luis");
        
        Usuario u3 = new Usuario("Maria");
        System.out.println(u3.getNombre());
        
        Usuario u4 = new Usuario("Pedro",-3);
        System.out.println(u4.getEdad());
        
        u4.setEdad(-4);
        
        System.out.println(u4.getEdad());
           */
    }
}
