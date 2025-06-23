package heiPROG2.encapsulation.exo5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class BrasserieTest {

    private Brasserie brasserie;

    @BeforeEach
    void setUp() {
        brasserie = new Brasserie();

        // Clients
        Client c1 = new Client(1, "Rabe", "Jean", "034123456", "jean@gmail.com");
        Client c2 = new Client(2, "Ando", "Marie", "033987654", "marie@yahoo.com");
        Client c3 = new Client(3, "Paul", "Marc", "032111111", null);
        brasserie.ajouterClient(c1);
        brasserie.ajouterClient(c2);
        brasserie.ajouterClient(c3);

        // Boissons
        Boisson b1 = new Boisson(1, "Coca", 1.5, 2500);
        Boisson b2 = new Boisson(2, "Fanta", 0.5, 2000);
        Boisson b3 = new Boisson(3, "THB", 0.65, 3000);
        brasserie.ajouterBoisson(b1);
        brasserie.ajouterBoisson(b2);
        brasserie.ajouterBoisson(b3);

        // Commande
        Commande cmd = new Commande(1, LocalDateTime.now(), c1);
        cmd.ajouterBoisson(new BoissonCommande(1, b1, 2)); // 3.0L
        cmd.ajouterBoisson(new BoissonCommande(2, b2, 1)); // 0.5L
        brasserie.ajouterCommande(cmd);
    }

    @Test
    void testRechercheBoissons() {
        List<Boisson> result = brasserie.rechercherBoissons("thb");
        assertEquals(1, result.size());
    }

    @Test
    void testRechercheClients() {
        List<Client> result = brasserie.rechercherClients("marie");
        assertEquals(1, result.size());
    }

    @Test
    void testCompterClientsParOperateur() {
        Map<String, Integer> stats = brasserie.compterClientsParOperateur();
        assertEquals(1, stats.get("telma"));
        assertEquals(1, stats.get("airtel"));
        assertEquals(1, stats.get("orange"));
    }

    @Test
    void testVolumeTotalCommande() {
        Commande cmd = brasserie.commandes.get(0);
        assertEquals(3.5, cmd.getVolumeTotal(), 0.01);
    }
}
