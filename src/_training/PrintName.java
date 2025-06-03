package _training;

public class PrintName {
    public static void main(String[] args) {
        String name = "myName";
        System.out.println(String.format("""
                Hello world !!!, 
                My name is %s!
                And I love Java
                """, name));
    }
}
