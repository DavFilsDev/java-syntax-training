package oop.encapsulation;

/**
 * This class explains what the different access modifiers do.
 */
public class AccessModifierDemo {
    public String publicField = "I am accessible everywhere";
    protected String protectedField = "I am accessible in the same package and in subclasses";
    String defaultField = "I am accessible in the same package only (no keyword)";
    private String privateField = "I am accessible only inside this class";

    public void showAccess() {
        System.out.println("Access inside the same class:");
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField);
        System.out.println("Default: " + defaultField);
        System.out.println("Private: " + privateField);
    }
}
