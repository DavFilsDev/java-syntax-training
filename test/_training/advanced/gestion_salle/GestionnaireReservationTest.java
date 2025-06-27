package _training.advanced.gestion_salle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class GestionnaireReservationTest {

    private GestionnaireReservation gestionnaire;

    @BeforeEach
    public void setup() {
        gestionnaire = new GestionnaireReservation();
        gestionnaire.ajouterSalle("Salle A");
    }

    @Test
    public void testAjoutSalleDoublon() {
        assertThrows(IllegalArgumentException.class, () -> gestionnaire.ajouterSalle("Salle A"));
    }

    @Test
    public void testReservationSansConflit() {
        LocalDateTime debut1 = LocalDateTime.of(2025, 6, 27, 9, 0);
        LocalDateTime fin1 = LocalDateTime.of(2025, 6, 27, 10, 0);
        Reservation res1 = gestionnaire.reserverSalle("Salle A", debut1, fin1);
        assertNotNull(res1);

        LocalDateTime debut2 = LocalDateTime.of(2025, 6, 27, 10, 0);
        LocalDateTime fin2 = LocalDateTime.of(2025, 6, 27, 11, 0);
        Reservation res2 = gestionnaire.reserverSalle("Salle A", debut2, fin2);
        assertNotNull(res2);
    }

    @Test
    public void testReservationConflit() {
        LocalDateTime debut1 = LocalDateTime.of(2025, 6, 27, 9, 0);
        LocalDateTime fin1 = LocalDateTime.of(2025, 6, 27, 10, 0);
        gestionnaire.reserverSalle("Salle A", debut1, fin1);

        LocalDateTime debut2 = LocalDateTime.of(2025, 6, 27, 9, 30);
        LocalDateTime fin2 = LocalDateTime.of(2025, 6, 27, 10, 30);

        assertThrows(IllegalStateException.class,
                () -> gestionnaire.reserverSalle("Salle A", debut2, fin2));
    }

    @Test
    public void testAnnulationReservation() {
        LocalDateTime debut = LocalDateTime.of(2025, 6, 27, 9, 0);
        LocalDateTime fin = LocalDateTime.of(2025, 6, 27, 10, 0);
        Reservation res = gestionnaire.reserverSalle("Salle A", debut, fin);

        boolean annule = gestionnaire.annulerReservation(res.getId());
        assertTrue(annule);

        // annulation d'un id inconnu
        assertFalse(gestionnaire.annulerReservation("inconnu"));
    }

    @Test
    public void testListerReservations() {
        LocalDateTime debut1 = LocalDateTime.of(2025, 6, 27, 8, 0);
        LocalDateTime fin1 = LocalDateTime.of(2025, 6, 27, 9, 0);
        gestionnaire.reserverSalle("Salle A", debut1, fin1);

        LocalDateTime debut2 = LocalDateTime.of(2025, 6, 27, 10, 0);
        LocalDateTime fin2 = LocalDateTime.of(2025, 6, 27, 11, 0);
        gestionnaire.reserverSalle("Salle A", debut2, fin2);

        assertEquals(2, gestionnaire.listerReservations("Salle A").size());
    }
}
