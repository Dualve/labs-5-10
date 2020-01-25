package by.bntu.fitr.poisit.dubodelov.lab8.third.model.logic;

public class Coordinates {

    private static final int POWER_OF = 2;

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, POWER_OF) + Math.pow(y2 - y1, POWER_OF));
    }
}
