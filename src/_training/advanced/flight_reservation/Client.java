package _training.advanced.flight_reservation;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String nom;
    private String email;
    private List<Reservation> reservations = new ArrayList<>();

    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public void ajouterReservation(Reservation r) {
        reservations.add(r);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public String getNom() {
        return nom;
    }
}
