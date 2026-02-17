package soporte.tickets;

import soporte.tickets.tipos.TicketAdministrativo;
import soporte.tickets.tipos.TicketBackend;
import soporte.tickets.tipos.TicketFrontend;

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
        for (int index=0; index<numTickets; index++) {
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
        Ticket t = getTicketOrThrow(indice);
                       
        System.out.println(t);
        System.out.println(t.isResuelto() ? "-> TICKET RESUELTO" : "-> TICKET PENDIENTE");
        
    }

    public void anyadeTicketFrontend(String origen, String ruta, int prioridad) throws TicketException {
        puedeAnyadir();
        Ticket t = new TicketFrontend(origen, prioridad, ruta);
        validaYAnyade(t);
    }

    public void anyadeTicketBackend(String origen, int prioridad) throws TicketException {
        puedeAnyadir();
        Ticket t = new TicketBackend(origen, prioridad);
        validaYAnyade(t);
    }

    public void anyadeTicketAdministrativo(String origen, String tramite, int prioridad) throws TicketException {
        puedeAnyadir();
        Ticket t = new TicketAdministrativo(origen, prioridad, tramite);
        validaYAnyade(t);
    }

    public void escalaTicket(int indice) throws TicketException {
        Ticket t = getTicketOrThrow(indice);
        
        if (t instanceof Escalable te) {
            te.escalar();
            System.out.println("Ticket escalado.");
        }
        else {
            throw new TicketException("No se puede escalar un ticket que no es Escalable.");
        }
    }

    public void resuelveTicket(int indice) throws TicketException {
        Ticket t = getTicketOrThrow(indice);
        
        t.resolver();
        
        System.out.println("Ticket resuelto.");
    }

    public void reset() {
        cola = new Ticket[100];
        numTickets = 0;
    }
    
    private Ticket getTicketOrThrow(int indice) throws TicketException {
        if (indice < 0 || indice > numTickets) {
            throw new TicketException("El índice de ticket no es correcto.");
        }
        
        return cola[indice];
    }
    
    private void puedeAnyadir () throws TicketException {
        if (numTickets >= cola.length) {
            throw new TicketException("No hay espacio para mas tickets");
        }
    }
    
    private void validaYAnyade(Ticket t) throws TicketException {
        t.validar();
       
        cola[numTickets]=t;
        numTickets = numTickets + 1;
        
        System.out.println("Ticket añadido");
    }
}
