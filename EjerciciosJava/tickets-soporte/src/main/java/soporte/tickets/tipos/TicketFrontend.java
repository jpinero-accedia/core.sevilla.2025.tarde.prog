package soporte.tickets.tipos;

import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketFrontend extends Ticket {
    private final String ruta;
    
    public TicketFrontend(String or, int prio, String ruta) {
        super(or.trim().toLowerCase(), prio);
        
        this.ruta = ruta.trim().toLowerCase();
        
        generaDescripcion();
    }
    
    @Override
    public void validar () throws TicketException {
        // Origen
        if (! getOrigen().equals("frontend") ) {
            throw new TicketException("Origen inválido para este tipo de ticket");
        }
        
        // prioridad y ruta
        switch(getPrioridad()) {
            case 1 -> {
                if (! (ruta.contains("checkout") || ruta.contains("pago")) ) {
                    throw new TicketException(
                        "Prioridad 1 necesita una ruate con 'checkout' o 'pago'."
                    );
                }
            }
            case 2 -> {}
            default -> throw new TicketException("Frontend Tickets necesitan prioridad 1 ó 2.");
        }
    }
    
    private void generaDescripcion() {
        anyadeDescripcion(String.format(
            """
            Ticket Frontend (origen: %s y prioridad: %d)
            Ruta: %s
            """,
            getOrigen(),
            getPrioridad(),
            ruta
        ));
    }
    
}
