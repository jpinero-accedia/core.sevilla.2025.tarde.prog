package aplicacion.mensajes;

public abstract class Mensaje {
    private String contenido = null;
    private String destinatario = null;
    private boolean enviado = false;
    
    public Mensaje (String destinatario, String contenido) {
        this.destinatario = destinatario;
        this.contenido = contenido;
    }
    
    public String getDestinatario() {
        return destinatario;
    }
    
    protected void setEnviado() {
        enviado = true;
    }
    
    public boolean getEnviado() {
        return enviado;
    }
    
    @Override
    public String toString() {
        return contenido;
    }
    
    public abstract boolean validarDestinatario();
}
