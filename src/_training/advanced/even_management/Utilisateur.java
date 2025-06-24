package _training.advanced.even_management;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private List<Inscription> inscriptions = new ArrayList<>();
    private List<Commentaire> commentaires = new ArrayList<>();

    public Utilisateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public void ajouterInscription(Inscription inscription) {
        inscriptions.add(inscription);
    }

    public void commenter(Evenement evenement, String contenu) {
        Commentaire commentaire = new Commentaire(contenu, this);
        commentaires.add(commentaire);
        evenement.ajouterCommentaire(commentaire);
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nom + " (" + email + ")";
    }
}
