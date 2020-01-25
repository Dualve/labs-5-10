package by.bntu.fitr.poisit.dubodelov.lab8.second.controller;

import by.bntu.fitr.poisit.dubodelov.lab8.second.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab8.second.model.logic.Cube;
import by.bntu.fitr.poisit.dubodelov.lab8.second.view.Printer;

public class Controller {

    private static final String MSG = "Enter the side of cube: ";
    private static final String MSG1 = " Side: ";
    private static final String MSG2 = " FullSquare: ";
    private static final String MSG3 = " Volume: ";

    public static void main(String[] args) {
        try {
            double side = UserInput.inputDouble(MSG);
            double square = Cube.findFullSquare(side);
            double volume = Cube.findVolume(side);

            Printer.printInfo(MSG1, MSG2, MSG3, side, square, volume);
        }catch (Exception e){
            Printer.printError("Net");
        }
    }

}
