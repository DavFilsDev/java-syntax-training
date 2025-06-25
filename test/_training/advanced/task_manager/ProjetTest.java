package _training.advanced.task_manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProjetTest {

    private Utilisateur alice;
    private Utilisateur bob;
    private Projet projet;

    @BeforeEach
    void setUp() {
        alice = new Utilisateur(1, "Alice", "alice@example.com");
        bob = new Utilisateur(2, "Bob", "bob@example.com");

        projet = new Projet(1, "Application Web");

        Tache t1 = new Tache(1, "Concevoir maquette", "UI/UX", Priorite.HAUTE, alice);
        Tache t2 = new Tache(2, "Configurer backend", "API Spring Boot", Priorite.MOYENNE, bob);
        Tache t3 = new Tache(3, "Tests unitaires", "JUnit tests", Priorite.BASSE, bob);

        projet.ajouterTache(t1);
        projet.ajouterTache(t2);
        projet.ajouterTache(t3);

        t1.changerStatut(StatutTache.TERMINEE);
        t2.changerStatut(StatutTache.EN_COURS);
    }

    @Test
    void testFiltrerParResponsable() {
        List<Tache> tachesBob = projet.filtrerParResponsable(bob);
        assertEquals(2, tachesBob.size());
    }

    @Test
    void testFiltrerParStatut() {
        List<Tache> aFaire = projet.filtrerParStatut(StatutTache.A_FAIRE);
        assertEquals(1, aFaire.size());
    }

    @Test
    void testTauxAvancement() {
        assertEquals(33.33, projet.getTauxAvancement(), 0.1);
    }

    @Test
    void testAjoutTache() {
        assertEquals(3, projet.getTaches().size());
    }
}
