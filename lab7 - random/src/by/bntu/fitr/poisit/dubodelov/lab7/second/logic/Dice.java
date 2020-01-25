package by.bntu.fitr.poisit.dubodelov.lab7.second.logic;

import java.util.Random;

public class Dice {

    private final static int MIN = 1;
    private final static int MAX = 6;

    public static int throwDice() {

        Random rand = new Random();
        int result = rand.nextInt(MAX) + MIN;

        return result;
    }

    public static int checkResult(int first, int second) {
        int result = first + second;

        return result;
    }

}
