package _training.advanced.marketplace_plateform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarketplaceTest {

    private Utilisateur alice;
    private Utilisateur bob;
    private Annonce annonce;

    @BeforeEach
    void setUp() {
        alice = new Utilisateur(1, "Alice", "alice@mail.com");
        bob = new Utilisateur(2, "Bob", "bob@mail.com");

        annonce = new Annonce(1, "Vélo", "Vélo presque neuf", 100000, alice);
    }

    @Test
    void testEnvoyerMessage() {
        bob.envoyerMessage(alice, "Bonjour, votre vélo est-il disponible ?");
        assertEquals(1, alice.getMessagesRecus().size());
        assertEquals("Bonjour, votre vélo est-il disponible ?", alice.getMessagesRecus().get(0).getContenu());
    }

    @Test
    void testTransactionEffectuee() {
        Transaction t = new Transaction(1, bob, annonce);
        t.effectuer();
        assertEquals(StatutTransaction.EFFECTUEE, t.getStatut());
        assertFalse(annonce.estDisponible());
    }

    @Test
    void testTransactionAnnulee() {
        Transaction t = new Transaction(2, bob, annonce);
        t.annuler();
        assertEquals(StatutTransaction.ANNULEE, t.getStatut());
        assertTrue(annonce.estDisponible());
    }
}
