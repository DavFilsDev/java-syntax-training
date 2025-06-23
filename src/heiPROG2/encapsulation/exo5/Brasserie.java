package heiPROG2.encapsulation.exo5;

import java.util.*;
import java.util.stream.Collectors;

public class Brasserie {
    private List<Boisson> boissons = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Commande> commandes = new ArrayList<>();

    public void ajouterBoisson(Boisson b) { boissons.add(b); }
    public void ajouterClient(Client c) { clients.add(c); }
    public void ajouterCommande(Commande cmd) { commandes.add(cmd); }

    public List<Boisson> rechercherBoissons(String motCle) {
        String mot = motCle.toLowerCase();
        return boissons.stream()
                .filter(b -> b.getNom().toLowerCase().contains(mot))
                .collect(Collectors.toList());
    }

    public List<Client> rechercherClients(String motCle) {
        String mot = motCle.toLowerCase();
        return clients.stream()
                .filter(c -> c.getNom().toLowerCase().contains(mot)
                        || c.getPrenom().toLowerCase().contains(mot)
                        || (c.getEmail() != null && c.getEmail().toLowerCase().contains(mot)))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> compterClientsParOperateur() {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("orange", 0);
        stats.put("telma", 0);
        stats.put("airtel", 0);

        for (Client c : clients) {
            String numero = c.getTelephone();
            if (numero.startsWith("032")) stats.put("orange", stats.get("orange") + 1);
            else if (numero.startsWith("034")) stats.put("telma", stats.get("telma") + 1);
            else if (numero.startsWith("033")) stats.put("airtel", stats.get("airtel") + 1);
        }

        return stats;
    }
}

