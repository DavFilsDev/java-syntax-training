package heiPROG2.encapsulation.exo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteTest {

    @Test
    public void testDepotEtSolde() {
        Client client = new Client("1","Vincent","alice", "alice@example.com");
        Compte compte = new Compte(client, 100.0);
        compte.deposer(50);
        assertEquals(150.0, compte.consulterSolde(), 0.01);
    }

    @Test
    public void testRetraitSuffisant() {
        Client client = new Client("2","Bernard","Bob", "bob@example.com");
        Compte compte = new Compte(client, 100.0);
        assertTrue(compte.retirer(70));
        assertEquals(30.0, compte.consulterSolde(), 0.01);
    }

    @Test
    public void testRetraitInsuffisant() {
        Client client = new Client("3","Elisabeth","Eve", "eve@example.com");
        Compte compte = new Compte(client, 20.0);
        assertFalse(compte.retirer(50));
        assertEquals(20.0, compte.consulterSolde(), 0.01);
    }

    @Test
    public void testVirement() {
        Client c1 = new Client("4","Bertrand","John", "john@example.com");
        Client c2 = new Client("5","Martin","Jane", "jane@example.com");

        Compte compte1 = new Compte(c1, 200);
        Compte compte2 = new Compte(c2, 100);

        assertTrue(compte1.virer(compte2, 50));
        assertEquals(150, compte1.consulterSolde(), 0.01);
        assertEquals(150, compte2.consulterSolde(), 0.01);
    }
}