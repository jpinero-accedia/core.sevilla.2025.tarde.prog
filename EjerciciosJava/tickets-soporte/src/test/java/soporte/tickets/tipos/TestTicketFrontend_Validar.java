/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package soporte.tickets.tipos;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import soporte.tickets.TicketException;

/**
 *
 * @author Tarde Juanma
 */
@Slf4j
public class TestTicketFrontend_Validar {

    public TestTicketFrontend_Validar() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    //@Disabled
    public void ticket_prioridad1_pago() throws TicketException {
        TicketFrontend tf = new TicketFrontend("frontend", 1, "pago");
        tf.validar();
    }

    
    @Test
    //@Disabled
    public void ticket_prioridad1_checkout() throws TicketException {
        TicketFrontend tf = new TicketFrontend("frontend", 1, "checkout");
        tf.validar();
    }
    
    
    @Test
    //@Disabled
    public void ticket_prioridad3_excepcion() {
        TicketFrontend tf = new TicketFrontend("frontend", 3, "checkout");
        assertThrowsExactly(TicketException.class, () -> tf.validar());
    }
    
    
}
