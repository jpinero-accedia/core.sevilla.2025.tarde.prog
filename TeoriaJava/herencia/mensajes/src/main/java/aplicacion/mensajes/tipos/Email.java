package aplicacion.mensajes.tipos;

import aplicacion.mensajes.Enviable;
import aplicacion.mensajes.Mensaje;

public class Email extends Mensaje implements Enviable {
    private static final String REGEX="[._a-zA-Z0-9]+@[._a-zA-Z0-9]+";
    private String asunto = null;
    
    public Email (String destinatario, String asunto, String contenido) {
        super(destinatario, contenido);
        this.asunto = asunto;
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
                             ASUNTO: %s
                             MENSAJE:
                             %s""",
                             getDestinatario(),
                             asunto,
                             super.toString()
                );
    }
    
    
}
