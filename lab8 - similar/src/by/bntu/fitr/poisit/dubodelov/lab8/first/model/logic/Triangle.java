package by.bntu.fitr.poisit.dubodelov.lab8.first.model.logic;

public class Triangle {

    private static final int POWER_OF = 2;
    private static final double DIVIDER = 0.5d;

    public static double findSideC(double a, double b) {
        return Math.sqrt(Math.pow(a, POWER_OF) + Math.pow(b, POWER_OF));
    }

    public static double findSquare(double a, double b) {
        return a * b * DIVIDER;
    }

    public static double findPerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
