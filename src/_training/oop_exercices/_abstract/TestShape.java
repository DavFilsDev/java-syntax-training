package _training.oop_exercices._abstract;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println(circle.getName() + " area: " + circle.getArea());
        System.out.println(rectangle.getName() + " area: " + rectangle.getArea());
    }
}

