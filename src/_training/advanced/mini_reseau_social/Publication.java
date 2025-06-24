package _training.advanced.mini_reseau_social;

import java.time.LocalDateTime;

public class Publication {
    private static int compteur = 1;
    private int id;
    private String contenu;
    private Utilisateur auteur;
    private LocalDateTime dateHeure;

    public Publication(String contenu, Utilisateur auteur) {
        this.id = compteur++;
        this.contenu = contenu;
        this.auteur = auteur;
        this.dateHeure = LocalDateTime.now();
    }

    public LocalDateTime getDateHeure() { return dateHeure; }

    public Utilisateur getAuteur() { return auteur; }

    @Override
    public String toString() {
        return "[" + dateHeure + "] " + auteur.getNom() + " : " + contenu;
    }
}

