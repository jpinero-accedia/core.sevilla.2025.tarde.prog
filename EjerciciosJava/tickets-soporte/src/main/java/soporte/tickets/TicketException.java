package soporte.tickets;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TicketException extends Exception {
    public TicketException (String msg) {
        super(msg);
    }
}
