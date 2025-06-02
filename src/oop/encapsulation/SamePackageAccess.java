package oop.encapsulation;

/**
 * This class is in the same package as AccessModifierDemo.
 * It shows what can be accessed from another class in the same package.
 */
public class SamePackageAccess {
    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();

        // ✅ Accessible: public, protected, and default (same package)
        System.out.println(demo.publicField);    // OK
        System.out.println(demo.protectedField); // OK
        System.out.println(demo.defaultField);   // OK

        // ❌ Not accessible: private
        // System.out.println(demo.privateField); // Error: privateField has private access
    }
}
