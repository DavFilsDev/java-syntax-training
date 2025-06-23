package heiPROG2.encapsulation.exo6;

public class Robot {
    protected Point position;
    protected Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.position = new Point(x, y);
        this.direction = direction;
    }

    public void avancer() {
        switch (direction) {
            case NORD -> position.deplacer(0, 1);
            case SUD -> position.deplacer(0, -1);
            case EST -> position.deplacer(1, 0);
            case OUEST -> position.deplacer(-1, 0);
        }
    }

    public void tournerDroite() {
        direction = direction.tournerDroite();
    }

    public Point getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Position: " + position + ", Direction: " + direction;
    }
}

