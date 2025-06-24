package _training.advanced.quiz_platform;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int id;
    private String titre;
    private Utilisateur auteur;
    private List<Question> questions = new ArrayList<>();

    public Quiz(int id, String titre, Utilisateur auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    public void ajouterQuestion(Question q) {
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int calculerScore(Utilisateur u) {
        int score = 0;
        for (Reponse r : u.getReponses()) {
            if (questions.contains(r.getQuestion()) && r.estCorrecte()) {
                score++;
            }
        }
        return score;
    }

    public int getNbQuestions() {
        return questions.size();
    }

    public String getTitre() {
        return titre;
    }
}

