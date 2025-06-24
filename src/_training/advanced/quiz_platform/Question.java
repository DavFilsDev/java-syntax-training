package _training.advanced.quiz_platform;

import java.util.List;

public class Question {
    private int id;
    private String enonce;
    private List<String> choix;
    private int indexBonneReponse;

    public Question(int id, String enonce, List<String> choix, int indexBonneReponse) {
        this.id = id;
        this.enonce = enonce;
        this.choix = choix;
        this.indexBonneReponse = indexBonneReponse;
    }

    public String getEnonce() {
        return enonce;
    }

    public List<String> getChoix() {
        return choix;
    }

    public boolean estBonneReponse(int indexChoisi) {
        return indexChoisi == indexBonneReponse;
    }
}

