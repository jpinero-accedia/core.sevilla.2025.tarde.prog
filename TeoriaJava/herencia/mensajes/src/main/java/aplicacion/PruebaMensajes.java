package aplicacion;

import aplicacion.mensajes.Enviable;
import aplicacion.mensajes.Mensaje;
import aplicacion.mensajes.MensajeException;
import aplicacion.mensajes.tipos.Email;
import aplicacion.mensajes.tipos.PostIt;
import aplicacion.mensajes.tipos.WhatsApp;
import java.util.Scanner;

public class PruebaMensajes {
    static Mensaje mensajes[] = new Mensaje[100];
    static int mensajesIndex = 0;

    public static void main(String[] args) throws MensajeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea crear un mensaje? S/N");
        while (sc.next().toUpperCase().equals("S")) {
            System.out.println("""
                               \u00bfQu\u00e9 desea crear? 
                               1. Email 
                               2. WhatsApp 
                               3. PosIt""");
            String tipo = sc.next();
            switch (tipo) {
                case "1" -> crearMail();
                case "2" -> crearWhatsApp();
                case "3" -> crearPosIt();
                default -> System.out.println("Elija una opción válida");
            }
            System.out.println("¿Desea enviar un nuevo mensaje? S/N");
        }

        enviarMensajes(); 
        mostrarMensajesEnviados(); 
    }

    private static void crearMail() throws MensajeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el email del destinatario");
        String destinatario = sc.nextLine();
        System.out.println("Introduce el asunto del email");
        String asunto = sc.nextLine();
        System.out.println("Introduce el contenido del email");
        String contenido = sc.nextLine();
        anadirMensaje(new Email(destinatario,asunto,contenido));
    }

    private static void crearWhatsApp() throws MensajeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el teléfono de destino");
        String destinatario = sc.nextLine();
        System.out.println("Introduce el contenido del whatsApp");
        String contenido = sc.nextLine();
        anadirMensaje(new WhatsApp(destinatario,contenido));
    }

    private static void crearPosIt() throws MensajeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué quieres poner en el posIt");
        String contenido = sc.nextLine();
        anadirMensaje(new PostIt(contenido)); 
    }
    
    private static void anadirMensaje (Mensaje msg) throws MensajeException {
        if (mensajesIndex >= mensajes.length) {
            throw new MensajeException("No caben más mensajes.");
        }
        
        mensajes[mensajesIndex] = msg;
        mensajesIndex = mensajesIndex + 1;
    }
    
    private static void enviarMensajes() {
        Mensaje msg;
        
        for (int i=0; i<mensajesIndex; i++) {
            msg = mensajes[i];
            
            if (msg.validarDestinatario()) {
                if (msg instanceof Enviable env) {
                    env.enviar();
                }
            }
        }
    }
    
    private static void mostrarMensajesEnviados () {
        Mensaje msg;
        
        for (int i=0; i<mensajesIndex; i++) {
            msg = mensajes[i];
            
            if (msg.getEnviado()) {
                System.out.println();
                System.out.println(msg);
            }
        }
    }
}
