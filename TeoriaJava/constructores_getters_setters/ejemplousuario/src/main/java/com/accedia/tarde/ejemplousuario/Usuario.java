/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.ejemplousuario;

/**
 *
 * @author Tarde Juanma
 */
public class Usuario {
    private String  email;
    private String  password;
    private String  nombre;
    private int     edad;
    private boolean admin;
    
    
    public Usuario() {
        System.out.println("Se ha creado un nuevo usuario");
    }
    
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        System.out.println("NUEVO USUARIO:" + nombre);
    }
    
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.setEdad(edad);
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
        else {
            System.err.println("LA EDAD NO ES VALIDA");
        }
    }
    
    public boolean isAdmin () {
        return this.admin;
    }
    
    public void setAdmin (boolean value) {
        this.admin = value;
    }
}
