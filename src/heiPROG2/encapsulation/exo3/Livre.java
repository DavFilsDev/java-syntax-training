package heiPROG2.encapsulation.exo3;

// Livre.java
import java.time.LocalDate;
import java.util.Set;

public class Livre {
    private int id;
    private String titre;
    private int nbPages;
    private LocalDate dateParution;
    private String resume;
    private Set<String> genres; // ex: "romance", "action"
    private Auteur auteur;

    public Livre(int id, String titre, int nbPages, LocalDate dateParution, String resume, Set<String> genres, Auteur auteur) {
        this.id = id;
        this.titre = titre;
        this.nbPages = nbPages;
        this.dateParution = dateParution;
        this.resume = resume;
        this.genres = genres;
        this.auteur = auteur;
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public String getResume() { return resume; }
    public Set<String> getGenres() { return genres; }
    public Auteur getAuteur() { return auteur; }

    @Override
    public String toString() {
        return titre + " par " + auteur.getNomAuteur();
    }
}

