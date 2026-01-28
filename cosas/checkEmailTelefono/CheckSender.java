/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.email;

public class CheckSender {
    public static boolean esTelefonoRegex(String telefono) {
        boolean ok = telefono.matches("\+34[0-9]{9}");
        return ok;
    }
    

    public static boolean esTelefono(String telefono) {
        boolean ok = false;

        if (telefono.length() == 9) {
            ok = true;
            for (int i = 0; i <= telefono.length(); i++) {
                if (!Character.isDigit(telefono.charAt(i))) {
                    ok=false;
                    break;
                }
            }
        }

        // devuelve si la cadena es telefono
        return ok;
    }

    public static boolean esEmailRegex(String email) {
        String regex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]+";
        return email.matches(regex);
    }

    public static boolean esEmail(String email) {
        String[] componentes;
        boolean ok = false;

        componentes = email.split("@");

        if (componentes.length == 2) {
            ok = true;
            for (String comp : componentes) {
                if (comp.isEmpty()) {
                    ok = false;
                    break;
                }
            }
        }

        return ok;
    }
}
