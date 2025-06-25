package _training.advanced.flight_reservation;

import java.time.LocalDateTime;
import java.util.EnumMap;
import java.util.Map;

public class Vol {
    private int id;
    private String depart;
    private String destination;
    private LocalDateTime dateHeure;
    private Map<ClasseVol, Integer> placesDisponibles;
    private Map<ClasseVol, Double> prixParClasse;

    public Vol(int id, String depart, String destination, LocalDateTime dateHeure) {
        this.id = id;
        this.depart = depart;
        this.destination = destination;
        this.dateHeure = dateHeure;
        this.placesDisponibles = new EnumMap<>(ClasseVol.class);
        this.prixParClasse = new EnumMap<>(ClasseVol.class);
    }

    public void definirPlaces(ClasseVol classe, int nb) {
        placesDisponibles.put(classe, nb);
    }

    public void definirPrix(ClasseVol classe, double prix) {
        prixParClasse.put(classe, prix);
    }

    public boolean verifierDisponibilite(ClasseVol classe, int nbPlaces) {
        return placesDisponibles.getOrDefault(classe, 0) >= nbPlaces;
    }

    public void reserverPlaces(ClasseVol classe, int nbPlaces) {
        placesDisponibles.put(classe, placesDisponibles.get(classe) - nbPlaces);
    }

    public double getPrixParClasse(ClasseVol classe) {
        return prixParClasse.getOrDefault(classe, 0.0);
    }

    public String getDestination() {
        return destination;
    }

    public String getDepart() {
        return depart;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }
}

