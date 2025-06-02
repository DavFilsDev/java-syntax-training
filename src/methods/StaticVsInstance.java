package methods;

public class StaticVsInstance {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        staticMethod(); // Call static method

        StaticVsInstance obj = new StaticVsInstance();
        obj.instanceMethod(); // Call instance method using object
    }
}
