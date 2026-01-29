package aplicacion.mensajes.tipos;

import aplicacion.mensajes.Mensaje;

public class PostIt extends Mensaje {
    public PostIt (String contenido) {
        super(null, contenido);
    }

    @Override
    public boolean validarDestinatario() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("""
                             MENSAJE:
                             %s""",
                             super.toString()
                );
    }
}
