package _training.advanced.task_manager;

public class Tache {
    private int id;
    private String titre;
    private String description;
    private StatutTache statut;
    private Priorite priorite;
    private Utilisateur responsable;

    public Tache(int id, String titre, String description, Priorite priorite, Utilisateur responsable) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.priorite = priorite;
        this.responsable = responsable;
        this.statut = StatutTache.A_FAIRE;
    }

    public void changerStatut(StatutTache nouveauStatut) {
        this.statut = nouveauStatut;
    }

    public StatutTache getStatut() {
        return statut;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return titre + " [" + statut + "] (" + priorite + ")";
    }
}

