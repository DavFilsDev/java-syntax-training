package heiPROG2.encapsulation.exo5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private LocalDateTime dateHeure;
    private Client client;
    private List<BoissonCommande> boissons;

    public Commande(int id, LocalDateTime dateHeure, Client client) {
        this.id = id;
        this.dateHeure = dateHeure;
        this.client = client;
        this.boissons = new ArrayList<>();
    }

    public void ajouterBoisson(BoissonCommande bc) {
        boissons.add(bc);
    }

    public List<BoissonCommande> getBoissons() {
        return boissons;
    }

    public double getVolumeTotal() {
        return boissons.stream()
                .mapToDouble(BoissonCommande::getVolumeTotal)
                .sum();
    }

    public Client getClient() { return client; }
}

