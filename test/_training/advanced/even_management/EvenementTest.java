package _training.advanced.even_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EvenementTest {

    private Utilisateur alice;
    private Utilisateur bob;
    private Evenement meetup;

    @BeforeEach
    void setUp() {
        alice = new Utilisateur(1, "Alice", "alice@gmail.com");
        bob = new Utilisateur(2, "Bob", "bob@gmail.com");

        meetup = new Evenement(1, "Java Meetup", "Antananarivo",
                LocalDateTime.of(2025, 7, 15, 18, 30), alice);
    }

    @Test
    void testInscriptionUtilisateur() {
        meetup.inscrire(bob);
        List<Utilisateur> participants = meetup.getParticipants();
        assertEquals(1, participants.size());
        assertEquals("Bob", participants.get(0).getNom());
    }

    @Test
    void testAjoutCommentaire() {
        bob.commenter(meetup, "Hâte de participer !");
        List<Commentaire> commentaires = meetup.getCommentairesRecents();
        assertEquals(1, commentaires.size());
        assertEquals("Hâte de participer !", commentaires.get(0).getContenu());
        assertEquals("Bob", commentaires.get(0).getAuteur().getNom());
    }

    @Test
    void testCommentairesOrdresRecents() throws InterruptedException {
        bob.commenter(meetup, "Premier commentaire");
        Thread.sleep(100); // pour avoir une différence de temps
        bob.commenter(meetup, "Deuxième commentaire");

        List<Commentaire> commentaires = meetup.getCommentairesRecents();
        assertEquals("Deuxième commentaire", commentaires.get(0).getContenu());
        assertEquals("Premier commentaire", commentaires.get(1).getContenu());
    }
}
