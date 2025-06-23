package heiPROG2.encapsulation.exo5;

public class BoissonCommande {
    private int id;
    private Boisson boisson;
    private int quantiteCommandee;

    public BoissonCommande(int id, Boisson boisson, int quantiteCommandee) {
        this.id = id;
        this.boisson = boisson;
        this.quantiteCommandee = quantiteCommandee;
    }

    public Boisson getBoisson() { return boisson; }

    public double getVolumeTotal() {
        return boisson.getQuantite() * quantiteCommandee;
    }
}

