package soporte.tickets;

public abstract class Ticket {
    private final String origen;
    private final int prioridad;
    private final StringBuilder descripcion;
    
    private boolean resuelto;
    
    public Ticket (String or, int prio) {
        origen = or;
        prioridad = prio;
        descripcion = new StringBuilder();
        resuelto = false;
    }
    
    public abstract void validar () throws TicketException;
    
    public void resolver () throws TicketException {
        if ( resuelto ) {
            throw new TicketException("No se puede resolver un ticket ya resuelto.");
        }
        else {
            resuelto=true;
        }
    }
    
    protected void anyadeDescripcion (String desc) {
        this.descripcion.append(desc);
    }
    
    protected void anyadeEscala () throws TicketException {
        if (resuelto) {
            throw new TicketException("No se puede escalar un tickect ya resuelto");
        }
        else {
            this.anyadeDescripcion("\nTICKET ESCALADO !!");
        }
    }
    
    protected String getOrigen () {
        return origen;
    }
    
    protected int getPrioridad () {
        return prioridad;
    }
    
    protected boolean isResuelto () {
        return this.resuelto;
    }
    
    @Override
    public String toString () {
        return this.descripcion.toString();
    }
}
