package heiPROG2.encapsulation.exo1;

public class Compte {
    private String id;
    private Client proprietaire;
    private double solde;

    public Compte(Client proprietaire, double soldeInitial) {
        this.proprietaire = proprietaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public boolean retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public boolean virer(Compte destinataire, double montant) {
        if (this.retirer(montant)) {
            destinataire.deposer(montant);
            return true;
        }
        return false;
    }

    public double consulterSolde() {
        return solde;
    }

    public Client getProprietaire() {
        return proprietaire;
    }
}

