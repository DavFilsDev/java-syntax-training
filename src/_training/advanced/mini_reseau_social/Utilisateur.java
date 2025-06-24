package _training.advanced.mini_reseau_social;
import java.util.*;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private Set<Utilisateur> suivis = new HashSet<>();
    private List<Publication> publications = new ArrayList<>();

    public Utilisateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public void suivre(Utilisateur autre) {
        if (!this.equals(autre)) {
            suivis.add(autre);
        }
    }

    public void publier(String contenu) {
        publications.add(new Publication(contenu, this));
    }

    public List<Publication> getFilActualite() {
        List<Publication> fil = new ArrayList<>();
        for (Utilisateur u : suivis) {
            fil.addAll(u.publications);
        }
        fil.sort(Comparator.comparing(Publication::getDateHeure).reversed());
        return fil;
    }

    public String getNom() { return nom; }

    @Override
    public String toString() {
        return nom + " (" + email + ")";
    }
}

