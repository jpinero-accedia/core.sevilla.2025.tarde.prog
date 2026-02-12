package soporte.tickets;

public class ColaTickets {
    Ticket[] cola = new Ticket[100];
    
    private int numTickets=0;
            
    public int getNumTickets() {
        return this.numTickets;
    }

    public void listaTicketsPendientes() {
        listaTicketsResueltosONo(false);
    }

    public void listaTicketsResueltos() throws TicketException {
        listaTicketsResueltosONo(true);
    }
    
    private void listaTicketsResueltosONo (boolean resuelto) {
        Ticket t;
        for (int index=0; index<=numTickets; index++) {
            t = cola[index];
            
            if (t.isResuelto() == resuelto) {
                if (! t.isResuelto()) {
                    System.out.println("Indice: " + index);
                }
                System.out.println(t);
            }
        }
    }  

    public void muestraTicket(int indice) throws TicketException {

    }

    public void anyadeTicketFrontend(String origen, String ruta, int prioridad) throws TicketException {

    }

    public void anyadeTicketBackend(String origen, int prioridad) throws TicketException {
        
    }

    public void anyadeTicketAdministrativo(String origen, String tramite, int prioridad) throws TicketException {
        
    }

    public void escalaTicket(int indice) throws TicketException {

    }

    public void resuelveTicket(int indice) throws TicketException {
        
    }

    public void reset() {
        cola = new Ticket[100];
    }
    
    private Ticket getTicketOrThrow(int indice) throws TicketException {
        return null; // TODO
    }
}
