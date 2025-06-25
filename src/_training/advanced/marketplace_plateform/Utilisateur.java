package _training.advanced.marketplace_plateform;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private List<Annonce> annonces = new ArrayList<>();
    private List<Message> messagesRecus = new ArrayList<>();
    private List<Message> messagesEnvoyes = new ArrayList<>();

    public Utilisateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public void publierAnnonce(Annonce a) {
        annonces.add(a);
    }

    public void envoyerMessage(Utilisateur destinataire, String contenu) {
        Message m = new Message(this, destinataire, contenu);
        destinataire.recevoirMessage(m);
        messagesEnvoyes.add(m);
    }

    private void recevoirMessage(Message m) {
        messagesRecus.add(m);
    }

    public List<Message> getMessagesRecus() {
        return messagesRecus;
    }

    public String getNom() {
        return nom;
    }
}

