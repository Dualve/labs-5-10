package by.bntu.fitr.povt.dubodelov.lab6.model.logic;

public class Day {
    public static int countDay(int day) {
        final int DAYS_IN_WEEK = 7;

        return day % DAYS_IN_WEEK;
    }
}
