package by.bntu.fitr.poisit.dubodelov.lab6.second.controller;

import by.bntu.fitr.poisit.dubodelov.lab6.second.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab6.second.view.Printer;
import by.bntu.fitr.poisit.dubodelov.lab6.second.model.logic.Coordinate;

import java.net.UnknownServiceException;
import java.util.SplittableRandom;

// check first coordinate place

public class Manager {
    private static final String MSG1 = new String("Enter x: ");
    private static final String MSG2 = new String("Enter y: ");

    public static void main(String[] args) {
        double x = UserInput.inputDouble(MSG1);
        double y = UserInput.inputDouble(MSG2);

        boolean checker = Coordinate.checkCoordinate(x, y);

        Printer.printInfo(x, y, checker);
    }
}
