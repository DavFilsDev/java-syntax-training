package _training.advanced.mini_reseau_social;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReseauSocial {
    private List<Utilisateur> utilisateurs = new ArrayList<>();

    public void ajouterUtilisateur(Utilisateur u) {
        utilisateurs.add(u);
    }

    public List<Utilisateur> chercherUtilisateurParNom(String nom) {
        return utilisateurs.stream()
                .filter(u -> u.getNom().toLowerCase().contains(nom.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Publication> afficherToutesLesPublications() {
        List<Publication> toutes = new ArrayList<>();
        for (Utilisateur u : utilisateurs) {
            toutes.addAll(u.getFilActualite());
        }
        return toutes;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}

