package by.bntu.fitr.poisit.dubodelov.lab6.second.model.logic;

//Design a program that checks that the point with coordinates (x, y)
//lies in the first (or in the second, or in the third, or in the fourth) coordinate
//a quarter.

public class Coordinate {

    public static boolean checkCoordinate(double x, double y) {

        return x > 0 && y > 0;

    }

}
