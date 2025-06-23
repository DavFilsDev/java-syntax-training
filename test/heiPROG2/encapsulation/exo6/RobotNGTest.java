package heiPROG2.encapsulation.exo6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RobotNGTest {

    @Test
    void testAvancerUnPas() {
        RobotNG robot = new RobotNG(0, 0, Direction.NORD);
        robot.avancer();
        assertEquals(0, robot.getPosition().getX());
        assertEquals(1, robot.getPosition().getY());
    }

    @Test
    void testAvancerPlusieursPas() {
        RobotNG robot = new RobotNG(0, 0, Direction.EST);
        robot.avancer(3);
        assertEquals(3, robot.getPosition().getX());
        assertEquals(0, robot.getPosition().getY());
    }

    @Test
    void testTournerGauche() {
        RobotNG robot = new RobotNG(0, 0, Direction.NORD);
        robot.tournerGauche(); // devient OUEST
        assertEquals(Direction.OUEST, robot.getDirection());
    }

    @Test
    void testTournerDroite() {
        RobotNG robot = new RobotNG(0, 0, Direction.EST);
        robot.tournerDroite(); // devient SUD
        assertEquals(Direction.SUD, robot.getDirection());
    }

    @Test
    void testReculer() {
        RobotNG robot = new RobotNG(1, 1, Direction.NORD);
        robot.reculer(); // devrait aller en bas
        assertEquals(1, robot.getPosition().getX());
        assertEquals(0, robot.getPosition().getY());
    }

    @Test
    void testToString() {
        RobotNG robot = new RobotNG(2, 3, Direction.SUD);
        String expected = "Position: (2, 3), Direction: SUD";
        assertEquals(expected, robot.toString());
    }
}
