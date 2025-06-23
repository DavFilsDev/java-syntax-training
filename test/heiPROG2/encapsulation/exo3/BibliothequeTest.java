package heiPROG2.encapsulation.exo3;

// BibliothequeTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class BibliothequeTest {

    private Auteur auteur;
    private Livre livre1;
    private Livre livre2;
    private Bibliotheque bibliotheque;

    @BeforeEach
    public void setUp() {
        auteur = new Auteur(1, "George", "Orwell", "G. Orwell",
                LocalDate.of(1903, 6, 25), "Homme", "UK");

        livre1 = new Livre(1, "1984", 328,
                LocalDate.of(1949, 6, 8), "A dystopian future",
                Set.of("thriller", "politique"), auteur);

        livre2 = new Livre(2, "Animal Farm", 112,
                LocalDate.of(1945, 8, 17), "Satire of totalitarianism",
                Set.of("politique", "educatif"), auteur);

        bibliotheque = new Bibliotheque(1, "Bibliothèque Centrale", "Rue des Livres", "Antananarivo");
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
    }

    @Test
    public void testAjoutEtRetraitLivre() {
        assertEquals(2, bibliotheque.listerLivresParTitre().size());

        bibliotheque.retirerLivreParId(1);
        assertEquals(1, bibliotheque.listerLivresParTitre().size());
    }

    @Test
    public void testTriParTitre() {
        List<Livre> livresTries = bibliotheque.listerLivresParTitre();
        assertEquals("1984", livresTries.get(0).getTitre());
        assertEquals("Animal Farm", livresTries.get(1).getTitre());
    }

    @Test
    public void testRechercheParTitre() {
        List<Livre> result = bibliotheque.chercherParTitre("1984");
        assertEquals(1, result.size());
        assertEquals("1984", result.get(0).getTitre());
    }

    @Test
    public void testRechercheParGenre() {
        List<Livre> result = bibliotheque.chercherParGenre("politique");
        assertEquals(2, result.size());
    }

    @Test
    public void testRechercheParMotCleResume() {
        List<Livre> result = bibliotheque.chercherParMotCleResume("totalitarianism");
        assertEquals(1, result.size());
        assertEquals("Animal Farm", result.get(0).getTitre());
    }

    @Test
    public void testAuteursDistincts() {
        Set<Auteur> auteurs = bibliotheque.getAuteursDistincts();
        assertEquals(1, auteurs.size());
    }

    @Test
    public void testNombreLivresParGenre() {
        Map<String, Long> genres = bibliotheque.compterLivresParGenre();
        assertEquals(3, genres.size());
        assertEquals(2, genres.get("politique"));
        assertEquals(1, genres.get("thriller"));
        assertEquals(1, genres.get("educatif"));
    }
}
