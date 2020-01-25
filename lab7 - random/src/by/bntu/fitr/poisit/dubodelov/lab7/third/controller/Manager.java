package by.bntu.fitr.poisit.dubodelov.lab7.third.controller;

import by.bntu.fitr.poisit.dubodelov.lab7.third.logic.Generator;
import by.bntu.fitr.poisit.dubodelov.lab7.third.view.Printer;
import by.bntu.fitr.poisit.dubodelov.lab7.third.logic.Mask;


public class Manager {
    private final static String MSG = "Enter your num: ";

    public static void main(String[] args) {

        int item = Generator.generate();
        String msg = Mask.chooseMask(item);

        Printer.outputResult(msg);
    }
}
