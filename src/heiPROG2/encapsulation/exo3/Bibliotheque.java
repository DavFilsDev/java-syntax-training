package heiPROG2.encapsulation.exo3;

import java.util.*;
import java.util.stream.Collectors;

public class Bibliotheque {
    private int id;
    private String nom;
    private String adresse;
    private String ville;
    private List<Livre> livres;

    public Bibliotheque(int id, String nom, String adresse, String ville) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void retirerLivreParId(int id) {
        livres.removeIf(livre -> livre.getId() == id);
    }

    public List<Livre> listerLivresParTitre() {
        return livres.stream()
                .sorted(Comparator.comparing(Livre::getTitre))
                .collect(Collectors.toList());
    }

    public List<Livre> chercherParTitre(String titre) {
        return livres.stream()
                .filter(livre -> livre.getTitre().equalsIgnoreCase(titre))
                .collect(Collectors.toList());
    }

    public List<Livre> chercherParGenre(String genre) {
        return livres.stream()
                .filter(livre -> livre.getGenres().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Livre> chercherParMotCleResume(String motCle) {
        return livres.stream()
                .filter(livre -> livre.getResume().toLowerCase().contains(motCle.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Set<Auteur> getAuteursDistincts() {
        return livres.stream()
                .map(Livre::getAuteur)
                .collect(Collectors.toSet());
    }

    public Map<String, Long> compterLivresParGenre() {
        return livres.stream()
                .flatMap(livre -> livre.getGenres().stream())
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()));
    }
}

