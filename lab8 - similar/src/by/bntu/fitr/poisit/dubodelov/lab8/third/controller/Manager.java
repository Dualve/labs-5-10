package by.bntu.fitr.poisit.dubodelov.lab8.third.controller;

import by.bntu.fitr.poisit.dubodelov.lab8.second.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab8.third.view.Printer;
import by.bntu.fitr.poisit.dubodelov.lab8.third.model.logic.Coordinates;

public class Manager {

    private static final String MSG = "Enter coordinate x1: ";
    private static final String MSG1 = "Enter coordinate y1: ";
    private static final String MSG2 = "Enter coordinate x2: ";
    private static final String MSG3 = "Enter coordinate y2: ";
    private static final String MSG4 = "Distance between dots = ";

    public static void main(String[] args) {

        try {
            double x1 = UserInput.inputDouble(MSG);
            double x2 = UserInput.inputDouble(MSG2);
            double y1 = UserInput.inputDouble(MSG1);
            double y2 = UserInput.inputDouble(MSG3);

            double distance = Coordinates.findDistance(x1, y1, x2, y2);

            Printer.printInfo(MSG4, distance);
        }catch (Exception e){
            Printer.printError("Net");
        }
    }
}
