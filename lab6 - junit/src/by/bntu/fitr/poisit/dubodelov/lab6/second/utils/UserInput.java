package by.bntu.fitr.poisit.dubodelov.lab6.second.utils;

import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public static double inputDouble(String msg){
        System.out.println(msg);
        return input.nextDouble();
    }


}
