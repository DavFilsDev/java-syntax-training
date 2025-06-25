package _training.advanced.task_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Projet {
    private int id;
    private String nom;
    private List<Tache> taches = new ArrayList<>();

    public Projet(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public List<Tache> filtrerParResponsable(Utilisateur u) {
        return taches.stream()
                .filter(t -> t.getResponsable().equals(u))
                .collect(Collectors.toList());
    }

    public List<Tache> filtrerParStatut(StatutTache statut) {
        return taches.stream()
                .filter(t -> t.getStatut() == statut)
                .collect(Collectors.toList());
    }

    public double getTauxAvancement() {
        if (taches.isEmpty()) return 0.0;
        long terminees = taches.stream()
                .filter(t -> t.getStatut() == StatutTache.TERMINEE)
                .count();
        return 100.0 * terminees / taches.size();
    }

    public List<Tache> getTaches() {
        return taches;
    }
}

