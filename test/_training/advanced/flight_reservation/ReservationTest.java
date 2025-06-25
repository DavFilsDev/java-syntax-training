package _training.advanced.flight_reservation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    private Client client;
    private Vol vol;

    @BeforeEach
    void setUp() {
        client = new Client(1, "Jean", "jean@gmail.com");
        vol = new Vol(1, "Tana", "Paris", LocalDateTime.of(2025, 8, 1, 12, 0));
        vol.definirPlaces(ClasseVol.ECO, 100);
        vol.definirPlaces(ClasseVol.BUSINESS, 10);
        vol.definirPrix(ClasseVol.ECO, 1200.0);
        vol.definirPrix(ClasseVol.BUSINESS, 2500.0);
    }

    @Test
    void testReservationValide() {
        Reservation r = new Reservation(1, client, vol, 2, ClasseVol.ECO);
        assertEquals(2, r.getNbPlaces());
        assertEquals(2400.0, r.calculerPrixTotal());
    }

    @Test
    void testReservationInvalide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Reservation(2, client, vol, 20, ClasseVol.BUSINESS);
        });
        assertEquals("Places insuffisantes !", exception.getMessage());
    }

    @Test
    void testPaiement() {
        Reservation r = new Reservation(3, client, vol, 1, ClasseVol.ECO);
        Paiement p = new Paiement(r);
        assertFalse(p.isEstPaye());
        p.payer();
        assertTrue(p.isEstPaye());
    }

    @Test
    void testReservationListeClient() {
        new Reservation(4, client, vol, 1, ClasseVol.ECO);
        assertEquals(1, client.getReservations().size());
    }
}
