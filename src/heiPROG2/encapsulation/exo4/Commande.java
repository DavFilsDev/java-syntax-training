package heiPROG2.encapsulation.exo4;

import java.time.LocalDate;
import java.util.*;

public class Commande {
    private int id;
    private LocalDate dateCommande;
    private Client client;
    private List<PlatCommande> plats;

    public Commande(int id, LocalDate dateCommande, Client client) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.client = client;
        this.plats = new ArrayList<>();
    }

    public void ajouterPlat(PlatCommande pc) {
        plats.add(pc);
    }

    public boolean estVide() {
        return plats.isEmpty();
    }

    public List<PlatCommande> getPlatsCommandes() {
        return plats;
    }

    public double getPrixTotal() {
        return plats.stream().mapToDouble(PlatCommande::getTotalPrix).sum();
    }

    public void fusionnerAvec(Commande autre) {
        plats.addAll(autre.getPlatsCommandes());
    }

    public int compterParType(String type) {
        return plats.stream()
                .filter(pc -> pc.getPlat().getType().equalsIgnoreCase(type))
                .mapToInt(PlatCommande::getQuantite)
                .sum();
    }

    public Plat getPlatLePlusCher() {
        return plats.stream()
                .max(Comparator.comparingDouble(pc -> pc.getPlat().getPrix()))
                .map(PlatCommande::getPlat)
                .orElse(null);
    }
}

