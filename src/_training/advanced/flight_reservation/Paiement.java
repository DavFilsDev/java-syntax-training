package _training.advanced.flight_reservation;

public class Paiement {
    private Reservation reservation;
    private double montant;
    private boolean estPaye;

    public Paiement(Reservation reservation) {
        this.reservation = reservation;
        this.montant = reservation.calculerPrixTotal();
        this.estPaye = false;
    }

    public void payer() {
        this.estPaye = true;
    }

    public boolean isEstPaye() {
        return estPaye;
    }

    public double getMontant() {
        return montant;
    }
}

