package by.bntu.fitr.poisit.dubodelov.lab6.third.controller;

import by.bntu.fitr.poisit.dubodelov.lab6.third.model.logic.Sequence;
import by.bntu.fitr.poisit.dubodelov.lab6.third.view.Printer;
import by.bntu.fitr.poisit.dubodelov.lab6.third.utils.UserInput;

// check increasing sequence

public class Manager {

    private static final String MSG = new String("Enter the num: ");

    public static void main(String[] args) {
        int num = UserInput.inputInt(MSG);

        boolean checker = Sequence.checkSequence(num);

        Printer.printInfo(num, checker);
    }
}
