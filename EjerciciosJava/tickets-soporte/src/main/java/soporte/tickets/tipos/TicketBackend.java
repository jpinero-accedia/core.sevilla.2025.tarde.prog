package soporte.tickets.tipos;

import soporte.tickets.Escalable;
import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketBackend extends Ticket implements Escalable {

    public TicketBackend(String or, int prio) {
        super(or.trim().toLowerCase(), prio);
        
        generaDescripcion();
    }

    @Override
    public void validar() throws TicketException {
        boolean ok=false;
        // Origen
        
        ok=switch(getOrigen()) {
            case "bbdd", "backend", "infra" -> true;
            default -> false;
        };
        
        if (!ok) {
            throw new TicketException("El origen no es válido para un ticket backend");
        }
        
        // Prioridad
        ok=switch(getPrioridad()) {
            case 1 -> getOrigen().equals("bbdd");
            case 2 -> ! getOrigen().equals("bbdd");
            default -> false;
        };
        
        if (!ok) {
            throw new TicketException("La prioridad del ticket backend no escompatible con el origen.");
        }   
    }
    
    
    private void generaDescripcion() {
        anyadeDescripcion(String.format(
                """
            Ticket Backend (origen: %s y prioridad: %d)
            """,
                getOrigen(),
                getPrioridad()
        ));
    }

    @Override
    public void escalar() throws TicketException {
        this.anyadeEscala();
    }
}
