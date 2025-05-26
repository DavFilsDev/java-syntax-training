package basics;

public class DataTypes {
    public static void main(String[] args) {
        // Demonstrating different primitive data types in Java
        byte aByte = 100;                // 1 byte (-128 to 127)
        short aShort = 10000;            // 2 bytes
        int anInt = 100000;              // 4 bytes
        long aLong = 10000000000L;       // 8 bytes (note the 'L' suffix)

        float aFloat = 3.14f;            // 4 bytes (note the 'f' suffix)
        double aDouble = 3.14159;        // 8 bytes

        char aChar = 'A';                // Single character
        boolean aBoolean = true;         // true or false

        // Display all the values
        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("char: " + aChar);
        System.out.println("boolean: " + aBoolean);
    }
}
