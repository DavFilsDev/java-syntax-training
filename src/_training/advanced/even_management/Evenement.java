package _training.advanced.even_management;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evenement {
    private int id;
    private String titre;
    private String lieu;
    private LocalDateTime date;
    private Utilisateur organisateur;

    private List<Inscription> inscriptions = new ArrayList<>();
    private List<Commentaire> commentaires = new ArrayList<>();

    public Evenement(int id, String titre, String lieu, LocalDateTime date, Utilisateur organisateur) {
        this.id = id;
        this.titre = titre;
        this.lieu = lieu;
        this.date = date;
        this.organisateur = organisateur;
    }

    public void inscrire(Utilisateur u) {
        Inscription i = new Inscription(u, this);
        inscriptions.add(i);
        u.ajouterInscription(i);
    }

    public void ajouterCommentaire(Commentaire c) {
        commentaires.add(c);
    }

    public List<Utilisateur> getParticipants() {
        List<Utilisateur> participants = new ArrayList<>();
        for (Inscription i : inscriptions) {
            participants.add(i.getUtilisateur());
        }
        return participants;
    }

    public List<Commentaire> getCommentairesRecents() {
        commentaires.sort((a, b) -> b.getDate().compareTo(a.getDate()));
        return commentaires;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return titre + " à " + lieu + " le " + date;
    }
}

