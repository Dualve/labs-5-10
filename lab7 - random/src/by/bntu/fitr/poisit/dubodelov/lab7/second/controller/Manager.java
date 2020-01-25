package by.bntu.fitr.poisit.dubodelov.lab7.second.controller;
import by.bntu.fitr.poisit.dubodelov.lab7.first.utils.UserInput;
import by.bntu.fitr.poisit.dubodelov.lab7.second.logic.Dice;
import by.bntu.fitr.poisit.dubodelov.lab7.second.view.Printer;


public class Manager {
    private final static String MSG = "Enter your num: ";

    public static void main(String[] args) {

        int firstThrow = Dice.throwDice();
        int secondThrow = Dice.throwDice();

        int result = Dice.checkResult(firstThrow, secondThrow);

        Printer.outputResult(result);

    }
}
