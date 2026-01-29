package aplicacion.mensajes;

public class MensajeException extends Exception {
    public MensajeException() {
        super();
    }
    
    public MensajeException (String msg) {
        super(msg);
    }
}
