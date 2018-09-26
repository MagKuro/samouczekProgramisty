package interfaceInJava;

public class Main {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.compute(2,5));
        Addition addition = new Addition();
        System.out.println(addition.compute(2,3));
    }
}
