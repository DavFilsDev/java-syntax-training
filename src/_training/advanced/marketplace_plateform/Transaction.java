package _training.advanced.marketplace_plateform;

import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private Utilisateur acheteur;
    private Annonce annonce;
    private StatutTransaction statut;
    private LocalDateTime date;

    public Transaction(int id, Utilisateur acheteur, Annonce annonce) {
        this.id = id;
        this.acheteur = acheteur;
        this.annonce = annonce;
        this.date = LocalDateTime.now();
        this.statut = StatutTransaction.EN_ATTENTE;
    }

    public void effectuer() {
        if (annonce.estDisponible()) {
            annonce.marquerCommeVendue();
            this.statut = StatutTransaction.EFFECTUEE;
        }
    }

    public void annuler() {
        this.statut = StatutTransaction.ANNULEE;
    }

    public StatutTransaction getStatut() {
        return statut;
    }

    public Annonce getAnnonce() {
        return annonce;
    }
}

