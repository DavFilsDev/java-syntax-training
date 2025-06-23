package heiPROG2.encapsulation.exo4;

import java.util.Set;

public class Plat {
    private int id;
    private String nom;
    private double prix;
    private String type; // entrée, résistance, dessert, snack, boisson
    private Set<Ingredient> ingredients;

    public Plat(int id, String nom, double prix, String type, Set<Ingredient> ingredients) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.type = type.toLowerCase();
        this.ingredients = ingredients;
    }

    public String getType() { return type; }
    public double getPrix() { return prix; }
    public String getNom() { return nom; }

    public boolean contientIngredient(Ingredient i) {
        return ingredients.contains(i);
    }
}

