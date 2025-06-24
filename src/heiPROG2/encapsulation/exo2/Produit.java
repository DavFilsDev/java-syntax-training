package heiPROG2.encapsulation.exo2;

public class Produit {
    private final int id;
    private String nom;
    private String description;
    private double prixUnitaire;
    private Categorie categorie;

    public Produit(int id, String nom, String description, double prixUnitaire, Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        setPrixUnitaire(prixUnitaire);
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        if (prixUnitaire >= 0) {
            this.prixUnitaire = prixUnitaire;
        }
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void baisserPrix(double pourcentage) {
        if (pourcentage > 0 && pourcentage <= 100) {
            double reduction = prixUnitaire * (pourcentage / 100);
            prixUnitaire -= reduction;
        }
    }
}