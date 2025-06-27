package _training.advanced.gestion_salle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private final String id;
    private final String salle;
    private final LocalDateTime debut;
    private final LocalDateTime fin;

    public Reservation(String salle, LocalDateTime debut, LocalDateTime fin) {
        if (fin.isBefore(debut) || fin.isEqual(debut)) {
            throw new IllegalArgumentException("La date de fin doit être après la date de début");
        }
        this.id = UUID.randomUUID().toString();
        this.salle = salle;
        this.debut = debut;
        this.fin = fin;
    }

    public String getId() {
        return id;
    }

    public String getSalle() {
        return salle;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    // Vérifie si deux réservations se chevauchent dans la même salle
    public boolean conflitAvec(Reservation autre) {
        if (!this.salle.equals(autre.salle)) return false;
        // Pas de conflit si fin avant début autre, ou début après fin autre
        return !(this.fin.isBefore(autre.debut) || this.debut.isAfter(autre.fin));
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id='" + id + '\'' +
                ", salle='" + salle + '\'' +
                ", debut=" + debut +
                ", fin=" + fin +
                '}';
    }
}
