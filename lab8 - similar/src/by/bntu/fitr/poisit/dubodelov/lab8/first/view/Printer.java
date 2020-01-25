package by.bntu.fitr.poisit.dubodelov.lab8.first.view;

public class Printer {

    private static final String MSG1 = " Triangle sides: ";
    private static final String MSG2 = " Square: ";
    private static final String MSG3 = " Perimeter: ";
    private static final String MSG4 = " , ";

    public static void printInfo(double a, double b, double c, double square, double perimeter) {
        System.out.println(MSG1 + a + MSG4 + b + MSG4 + c + MSG2 + square + MSG3 + perimeter);
    }

    public static void printError(String msg) {
        System.out.println(msg);
    }
}
