package _training.advanced.mini_reseau_social;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReseauSocialTest {

    private ReseauSocial reseau;
    private Utilisateur alice;
    private Utilisateur bob;
    private Utilisateur clara;

    @BeforeEach
    void setUp() {
        reseau = new ReseauSocial();

        alice = new Utilisateur(1, "Alice", "alice@example.com");
        bob = new Utilisateur(2, "Bob", "bob@example.com");
        clara = new Utilisateur(3, "Clara", "clara@example.com");

        reseau.ajouterUtilisateur(alice);
        reseau.ajouterUtilisateur(bob);
        reseau.ajouterUtilisateur(clara);

        bob.publier("Hello world from Bob!");
        clara.publier("Salut de Clara!");
        clara.publier("Clara poste encore.");

        alice.suivre(bob);
        alice.suivre(clara);
    }

    @Test
    void testRechercheUtilisateurParNom() {
        List<Utilisateur> result = reseau.chercherUtilisateurParNom("cla");
        assertEquals(1, result.size());
        assertEquals("Clara", result.get(0).getNom());
    }

    @Test
    void testFilActualite() {
        List<Publication> fil = alice.getFilActualite();
        assertEquals(3, fil.size());
        assertTrue(fil.get(0).getDateHeure().isAfter(fil.get(1).getDateHeure()));
    }

    @Test
    void testAjoutUtilisateur() {
        assertEquals(3, reseau.getUtilisateurs().size());
    }
}
