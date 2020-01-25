package by.bntu.fitr.poisit.dubodelov.lab8.first.controller;

import by.bntu.fitr.poisit.dubodelov.lab8.first.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab8.first.model.logic.Triangle;
import by.bntu.fitr.poisit.dubodelov.lab8.first.view.Printer;

public class Manager {

    private static final String MSG = "Enter the side of triangle: ";

    public static void main(String[] args) {

        try {
            double sideA = UserInput.inputDouble(MSG);
            double sideB = UserInput.inputDouble(MSG);

            double sideC = Triangle.findSideC(sideA, sideB);
            double square = Triangle.findSquare(sideA, sideB);
            double perimeter = Triangle.findPerimeter(sideA, sideB, sideC);
            Printer.printInfo(sideA, sideB, sideC, square, perimeter);
        }catch (Exception e) {
            Printer.printError("Net");
        }

    }
}
