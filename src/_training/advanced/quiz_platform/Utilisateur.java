package _training.advanced.quiz_platform;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private List<Reponse> reponses = new ArrayList<>();

    public Utilisateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public void repondre(Question question, int indexChoisi) {
        Reponse r = new Reponse(this, question, indexChoisi);
        reponses.add(r);
    }

    public String getNom() {
        return nom;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }
}

