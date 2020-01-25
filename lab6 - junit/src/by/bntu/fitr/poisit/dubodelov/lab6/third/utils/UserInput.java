package by.bntu.fitr.poisit.dubodelov.lab6.third.utils;

import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public static int inputInt(String msg){
        System.out.println(msg);
        return input.nextInt();
    }

}
