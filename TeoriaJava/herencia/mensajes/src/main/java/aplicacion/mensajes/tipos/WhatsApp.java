package aplicacion.mensajes.tipos;

import aplicacion.mensajes.Enviable;
import aplicacion.mensajes.Mensaje;

public class WhatsApp extends Mensaje implements Enviable {
    private static final String REGEX = "[0-9]{9}";
    
    public WhatsApp (String destinatario, String contenido) {
        super(destinatario, contenido);
    }

    @Override
    public boolean validarDestinatario() {
        return getDestinatario().matches(REGEX);
    }

    @Override
    public void enviar() {
        setEnviado();
    }
    
    @Override
    public String toString() {
        return String.format("""
                             DESTINATARIO: %s
                             MENSAJE:
                             %s""",
                             getDestinatario(),
                             super.toString()
                );
    }
}
