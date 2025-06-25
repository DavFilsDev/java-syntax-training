package _training.advanced.marketplace_plateform;

import java.time.LocalDateTime;

public class Message {
    private static int compteur = 1;
    private int id;
    private Utilisateur expediteur;
    private Utilisateur destinataire;
    private String contenu;
    private LocalDateTime date;

    public Message(Utilisateur expediteur, Utilisateur destinataire, String contenu) {
        this.id = compteur++;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
        this.contenu = contenu;
        this.date = LocalDateTime.now();
    }

    public String getContenu() {
        return contenu;
    }

    public Utilisateur getExpediteur() {
        return expediteur;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
