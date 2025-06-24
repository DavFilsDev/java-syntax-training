package heiPROG2.encapsulation.exo3;

import java.time.LocalDate;
import java.util.Set;

public class TestBibliotheque {
    public static void main(String[] args) {
        Auteur a1 = new Auteur(1, "George", "Orwell", "G. Orwell", LocalDate.of(1903, 6, 25), "Homme", "UK");
        Livre l1 = new Livre(1, "1984", 328, LocalDate.of(1949, 6, 8), "A dystopian future", Set.of("thriller", "politique"), a1);
        Livre l2 = new Livre(2, "Animal Farm", 112, LocalDate.of(1945, 8, 17), "Satire of totalitarianism", Set.of("politique", "educatif"), a1);

        Bibliotheque biblio = new Bibliotheque(1, "Biblio Centrale", "Rue des Livres", "Antananarivo");
        biblio.ajouterLivre(l1);
        biblio.ajouterLivre(l2);

        System.out.println("Livres triés par titre :");
        biblio.listerLivresParTitre().forEach(System.out::println);

        System.out.println("\nLivres contenant 'totalitarisme' dans le résumé :");
        biblio.chercherParMotCleResume("totalitarianism").forEach(System.out::println);

        System.out.println("\nNombre de livres par genre :");
        biblio.compterLivresParGenre().forEach((g, n) -> System.out.println(g + " : " + n));
    }
}

