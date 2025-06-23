package heiPROG2.encapsulation.exo6;

public class RobotNG extends Robot {

    public RobotNG(int x, int y, Direction direction) {
        super(x, y, direction);
    }

    public void tournerGauche() {
        direction = direction.tournerGauche();
    }

    public void avancer(int pas) {
        for (int i = 0; i < pas; i++) {
            avancer();
        }
    }

    public void reculer() {
        switch (direction) {
            case NORD -> position.deplacer(0, -1);
            case SUD -> position.deplacer(0, 1);
            case EST -> position.deplacer(-1, 0);
            case OUEST -> position.deplacer(1, 0);
        }
    }
}
