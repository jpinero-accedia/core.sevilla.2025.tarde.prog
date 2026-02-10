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
    
    protected void anyadeDescripcion (String desc) {
        this.descripcion.append(desc);
    }
    
    protected String getOrigen () {
        return origen;
    }
    
    protected int getPrioridad () {
        return prioridad;
    }
}
