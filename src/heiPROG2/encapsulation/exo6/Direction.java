package heiPROG2.encapsulation.exo6;

public enum Direction {
    NORD, EST, SUD, OUEST;

    public Direction tournerDroite() {
        return values()[(this.ordinal() + 1) % 4];
    }

    public Direction tournerGauche() {
        return values()[(this.ordinal() + 3) % 4]; // recule d’un pas
    }
}

