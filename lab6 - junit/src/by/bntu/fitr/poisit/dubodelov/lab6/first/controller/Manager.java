package by.bntu.fitr.poisit.dubodelov.lab6.first.controller;

import by.bntu.fitr.poisit.dubodelov.lab6.first.model.logic.Triangle;
import by.bntu.fitr.poisit.dubodelov.lab6.first.view.Printer;
import by.bntu.fitr.poisit.dubodelov.lab6.first.utils.UserInput;

// check triangle

public class Manager {

    private static final String MSG1 = new String("Enter side A: ");
    private static final String MSG2 = new String("Enter side B: ");
    private static final String MSG3 = new String("Enter side C: ");

    public static void main(String[] args) {

        double a = UserInput.inputDouble(MSG1);
        double b = UserInput.inputDouble(MSG2);
        double c = UserInput.inputDouble(MSG3);

        boolean checker = Triangle.checkTriangle(a, b, c);

        Printer.printInfo(a, b, c, checker);

    }
}
