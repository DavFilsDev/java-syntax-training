package heiPROG2.encapsulation.exo4;

public class Ingredient {
    private int id;
    private String nom;

    public Ingredient(int id, String nom) {
        this.id = id;
        this.nom = nom.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        Ingredient i = (Ingredient) o;
        return nom.equalsIgnoreCase(i.nom);
    }

    @Override
    public int hashCode() {
        return nom.toLowerCase().hashCode();
    }
}

