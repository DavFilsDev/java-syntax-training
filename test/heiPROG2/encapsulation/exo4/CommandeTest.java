package heiPROG2.encapsulation.exo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CommandeTest {

    private Client client;
    private Plat plat1, plat2, plat3;
    private Commande commande;

    @BeforeEach
    void setUp() {
        client = new Client(1, "Rabe", "Jean", "034123456");
        Ingredient fromage = new Ingredient(1, "Fromage");
        Ingredient tomate = new Ingredient(2, "Tomate");

        plat1 = new Plat(1, "Pizza", 20.0, "résistance", Set.of(fromage, tomate));
        plat2 = new Plat(2, "Coca", 5.0, "boisson", Set.of());
        plat3 = new Plat(3, "Salade", 8.0, "entrée", Set.of(tomate));

        commande = new Commande(1, LocalDate.now(), client);
        commande.ajouterPlat(new PlatCommande(1, plat1, 1));
        commande.ajouterPlat(new PlatCommande(2, plat2, 2));
    }

    @Test
    void testPrixTotal() {
        assertEquals(30.0, commande.getPrixTotal());
    }

    @Test
    void testEstVide() {
        assertFalse(commande.estVide());
    }

    @Test
    void testCompterParType() {
        assertEquals(2, commande.compterParType("boisson"));
        assertEquals(1, commande.compterParType("résistance"));
    }

    @Test
    void testFusionnerCommande() {
        Commande autre = new Commande(2, LocalDate.now(), client);
        autre.ajouterPlat(new PlatCommande(3, plat3, 1));
        commande.fusionnerAvec(autre);
        assertEquals(3, commande.getPlatsCommandes().size());
    }

    @Test
    void testPlatLePlusCher() {
        Plat plusCher = commande.getPlatLePlusCher();
        assertEquals("Pizza", plusCher.getNom());
    }

    @Test
    void testIngredientDansPlat() {
        assertTrue(plat1.contientIngredient(new Ingredient(1, "fromage")));
        assertFalse(plat2.contientIngredient(new Ingredient(1, "fromage")));
    }
}
