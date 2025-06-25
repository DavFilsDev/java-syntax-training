package _training.advanced.marketplace_plateform;

public class Annonce {
    private int id;
    private String titre;
    private String description;
    private double prix;
    private Utilisateur vendeur;
    private boolean estVendue;

    public Annonce(int id, String titre, String description, double prix, Utilisateur vendeur) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.vendeur = vendeur;
        this.estVendue = false;
        vendeur.publierAnnonce(this);
    }

    public void marquerCommeVendue() {
        this.estVendue = true;
    }

    public boolean estDisponible() {
        return !estVendue;
    }

    public Utilisateur getVendeur() {
        return vendeur;
    }

    public double getPrix() {
        return prix;
    }

    public String getTitre() {
        return titre;
    }
}

