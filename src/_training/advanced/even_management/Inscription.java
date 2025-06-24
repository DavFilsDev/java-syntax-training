package _training.advanced.even_management;

import java.time.LocalDateTime;

public class Inscription {
    private Utilisateur utilisateur;
    private Evenement evenement;
    private LocalDateTime dateInscription;

    public Inscription(Utilisateur utilisateur, Evenement evenement) {
        this.utilisateur = utilisateur;
        this.evenement = evenement;
        this.dateInscription = LocalDateTime.now();
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public LocalDateTime getDateInscription() {
        return dateInscription;
    }
}

