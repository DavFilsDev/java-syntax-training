package _training.advanced.gestion_salle;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireReservation {
    private final List<String> salles = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();

    // Ajoute une salle si elle n'existe pas déjà
    public void ajouterSalle(String nomSalle) {
        if (salles.contains(nomSalle)) {
            throw new IllegalArgumentException("Salle déjà existante");
        }
        salles.add(nomSalle);
    }

    // Réserve une salle pour une plage horaire
    public Reservation reserverSalle(String nomSalle, LocalDateTime debut, LocalDateTime fin) {
        if (!salles.contains(nomSalle)) {
            throw new IllegalArgumentException("Salle inexistante");
        }
        Reservation nouvelle = new Reservation(nomSalle, debut, fin);
        for (Reservation res : reservations) {
            if (res.conflitAvec(nouvelle)) {
                throw new IllegalStateException("Conflit de réservation détecté");
            }
        }
        reservations.add(nouvelle);
        return nouvelle;
    }

    // Annule une réservation selon son ID
    public boolean annulerReservation(String id) {
        return reservations.removeIf(r -> r.getId().equals(id));
    }

    // Liste toutes les réservations pour une salle donnée
    public List<Reservation> listerReservations(String nomSalle) {
        List<Reservation> result = new ArrayList<>();
        for (Reservation r : reservations) {
            if (r.getSalle().equals(nomSalle)) {
                result.add(r);
            }
        }
        return result;
    }
}
