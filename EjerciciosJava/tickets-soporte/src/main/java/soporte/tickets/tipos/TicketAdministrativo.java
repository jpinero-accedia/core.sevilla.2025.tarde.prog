package soporte.tickets.tipos;

import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketAdministrativo extends Ticket {

    private String tramite;

    public TicketAdministrativo(String or, int prio, String tramite) {
        super(or.trim().toLowerCase(), prio);

        this.tramite = tramite;
        generaDescripcion();
    }

    @Override
    public void validar() throws TicketException {
        // origen
        if (!getOrigen().equals("admin")) {
            throw new TicketException("En un ticket Administrativo el origen tiene que ser 'admin'.");
        }

        // prioridad
        if (getPrioridad() != 3) {
            throw new TicketException("En un ticket administrativo la prioridad debe de ser 3.");
        }
    }

    private void generaDescripcion() {
        anyadeDescripcion(String.format(
                """
            Ticket Frontend (origen: %s y prioridad: %d)
            Trámite: %s
            """,
                getOrigen(),
                getPrioridad(),
                tramite
        ));
    }

}
