package heiPROG2.encapsulation.exo3;
import java.time.LocalDate;

public class Auteur {
    private int id;
    private String prenom;
    private String nom;
    private String nomAuteur;
    private LocalDate dateNaissance;
    private String genre;
    private String pays;

    public Auteur(int id, String prenom, String nom, String nomAuteur, LocalDate dateNaissance, String genre, String pays) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.nomAuteur = nomAuteur;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.pays = pays;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    @Override
    public String toString() {
        return nomAuteur + " (" + prenom + " " + nom + ")";
    }
}

