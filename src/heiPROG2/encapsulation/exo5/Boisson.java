package heiPROG2.encapsulation.exo5;

public class Boisson {
    private int id;
    private String nom;
    private double quantite; // En litre, ex : 1.5 = 1.5L, 0.25 = 250ml
    private double prixUnitaire;

    public Boisson(int id, String nom, double quantite, double prixUnitaire) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() { return nom; }
    public double getQuantite() { return quantite; }
    public double getPrixUnitaire() { return prixUnitaire; }
}

