package by.bntu.fitr.poisit.dubodelov.lab7.first.controller;
import by.bntu.fitr.poisit.dubodelov.lab7.first.logic.Greatest;
import by.bntu.fitr.poisit.dubodelov.lab7.first.view.Printer;
import by.bntu.fitr.poisit.dubodelov.lab7.first.utils.UserInput;


public class Manager {
    private final static String MSG = "Enter your num: ";

    public static void main(String[] args) {
        double num1 = UserInput.input(MSG);
        double num2 = UserInput.input(MSG);
        double num3 = UserInput.input(MSG);
        double num4 = UserInput.input(MSG);

        double result = Greatest.checkGreatest(num1, num2, num3, num4);

        Printer.outputResult(result);
    }
}
