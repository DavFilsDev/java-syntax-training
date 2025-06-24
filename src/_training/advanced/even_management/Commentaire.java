package _training.advanced.even_management;

import java.time.LocalDateTime;

public class Commentaire {
    private String contenu;
    private Utilisateur auteur;
    private LocalDateTime date;

    public Commentaire(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
        this.date = LocalDateTime.now();
    }

    public String getContenu() {
        return contenu;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "[" + date + "] " + auteur.getNom() + " : " + contenu;
    }
}

