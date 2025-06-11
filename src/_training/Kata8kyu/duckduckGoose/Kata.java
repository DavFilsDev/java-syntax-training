package _training.Kata8kyu.duckduckGoose;

/**
 * Contains the logic for the Duck Duck Goose game.
 */
public class Kata {

    /**
     * Selects a player based on the duck-duck-goose count.
     *
     * @param players array of Player objects
     * @param goose index count
     * @return the name of the selected player
     */
    public static String duckDuckGoose(Player[] players, int goose) {
        // Using modular arithmetic to loop around the array
        return players[(goose - 1) % players.length].name;
    }

    public static void main(String[] args) {
        // Test the kata
        Player[] players = {
                new Player("Alice"),
                new Player("Bob"),
                new Player("Charlie"),
                new Player("Diana")
        };

        System.out.println(duckDuckGoose(players, 1));  // Output: Alice
        System.out.println(duckDuckGoose(players, 5));  // Output: Alice
        System.out.println(duckDuckGoose(players, 7));  // Output: Charlie
    }
}
