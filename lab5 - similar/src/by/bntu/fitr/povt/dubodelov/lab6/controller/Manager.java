package by.bntu.fitr.povt.dubodelov.lab6.controller;

import by.bntu.fitr.povt.dubodelov.lab6.view.Printer;
import by.bntu.fitr.povt.dubodelov.lab6.utils.UserInput;
import by.bntu.fitr.povt.dubodelov.lab6.model.logic.Day;

public class Manager {
    public static void main(String[] args) {

        int thisDay = UserInput.input("Enter the num of day: ");
        int dayInWeek = Day.countDay(thisDay);

        Printer.outputResult(thisDay, dayInWeek);
    }
}
