package by.bntu.fitr.poisit.dubodelov.lab8.second.model.logic;

public class Cube {

    private static final int POWER_OF_VOLUME = 3;
    private static final int POWER_OF_SQUARE = 2;
    private static final int AMOUNT_OF_SIDES = 6;

    public static double findVolume(double side) {
        return Math.abs(Math.pow(side, POWER_OF_VOLUME));
    }

    public static double findFullSquare(double side) {
        return Math.pow(side, POWER_OF_SQUARE) * AMOUNT_OF_SIDES;
    }
}
