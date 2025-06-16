package heiPROG2.encapsulation.exo2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProduitTest {

    @Test
    public void testCreationProduit() {
        Produit p = new Produit(1, "MacBook", "Laptop Apple", 2000.0, Categorie.ORDINATEUR);
        assertEquals("MacBook", p.getNom());
        assertEquals(2000.0, p.getPrixUnitaire(), 0.01);
        assertEquals(Categorie.ORDINATEUR, p.getCategorie());
    }

    @Test
    public void testBaisserPrixValide() {
        Produit p = new Produit(2, "iPhone", "Smartphone Apple", 1000.0, Categorie.TELEPHONE);
        p.baisserPrix(10); // Réduction de 10%
        assertEquals(900.0, p.getPrixUnitaire(), 0.01);
    }

    @Test
    public void testBaisserPrixInvalide() {
        Produit p = new Produit(3, "Câble USB", "Accessoire utile", 20.0, Categorie.ACCESSOIRE);
        p.baisserPrix(-5); // Réduction invalide
        assertEquals(20.0, p.getPrixUnitaire(), 0.01); // Ne change rien
    }

    @Test
    public void testPrixToujoursPositif() {
        Produit p = new Produit(4, "Routeur", "Connexion internet", 100.0, Categorie.ACCESSOIRE);
        p.setPrixUnitaire(-50); // Invalide
        assertEquals(100.0, p.getPrixUnitaire(), 0.01); // Reste inchangé
    }
}