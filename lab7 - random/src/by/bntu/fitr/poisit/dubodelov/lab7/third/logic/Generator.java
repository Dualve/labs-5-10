package by.bntu.fitr.poisit.dubodelov.lab7.third.logic;

import java.util.Random;

public class Generator {

    private final static int MAX = 3;
    private final static int MIN = 1;

    public static int generate(){

        Random rand = new Random();
        int num = rand.nextInt(MAX) + MIN;

        return num;


    }

}
