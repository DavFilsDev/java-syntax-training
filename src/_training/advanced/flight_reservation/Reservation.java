package _training.advanced.flight_reservation;

import java.time.LocalDateTime;

public class Reservation {
    private int id;
    private Client client;
    private Vol vol;
    private int nbPlaces;
    private ClasseVol classe;
    private LocalDateTime dateReservation;

    public Reservation(int id, Client client, Vol vol, int nbPlaces, ClasseVol classe) {
        this.id = id;
        this.client = client;
        this.vol = vol;
        this.nbPlaces = nbPlaces;
        this.classe = classe;
        this.dateReservation = LocalDateTime.now();

        if (!vol.verifierDisponibilite(classe, nbPlaces)) {
            throw new IllegalArgumentException("Places insuffisantes !");
        }

        vol.reserverPlaces(classe, nbPlaces);
        client.ajouterReservation(this);
    }

    public double calculerPrixTotal() {
        return nbPlaces * vol.getPrixParClasse(classe);
    }

    public Vol getVol() {
        return vol;
    }

    public ClasseVol getClasse() {
        return classe;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }
}

