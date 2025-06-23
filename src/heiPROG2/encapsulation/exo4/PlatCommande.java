package heiPROG2.encapsulation.exo4;

public class PlatCommande {
    private int id;
    private Plat plat;
    private int quantite;

    public PlatCommande(int id, Plat plat, int quantite) {
        this.id = id;
        this.plat = plat;
        this.quantite = quantite;
    }

    public Plat getPlat() { return plat; }
    public int getQuantite() { return quantite; }

    public double getTotalPrix() {
        return plat.getPrix() * quantite;
    }
}

