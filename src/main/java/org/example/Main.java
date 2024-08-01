package org.example;

public class Main {
    public static void main(String[] args) {

        // Example for method Overriding
        Printer printer = new Printer();
        printer.print();

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();

        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();
        blackAndWhitePrinter.print();

        // Method Overloading
        sum(1, 2);
        sum(1.5, 2.5);
        sum(1,3,5);

        // Operator Overloading

        sum("Big", "River");

    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void sum(String a, String b) {
        System.out.println(a+" "+ b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }
}