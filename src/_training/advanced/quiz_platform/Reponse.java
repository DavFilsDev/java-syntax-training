package _training.advanced.quiz_platform;

public class Reponse {
    private Utilisateur utilisateur;
    private Question question;
    private int indexChoisi;

    public Reponse(Utilisateur utilisateur, Question question, int indexChoisi) {
        this.utilisateur = utilisateur;
        this.question = question;
        this.indexChoisi = indexChoisi;
    }

    public boolean estCorrecte() {
        return question.estBonneReponse(indexChoisi);
    }

    public Question getQuestion() {
        return question;
    }

    public int getIndexChoisi() {
        return indexChoisi;
    }
}

