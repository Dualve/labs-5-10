package by.bntu.fitr.poisit.dubodelov.lab8.second.utils;

import java.util.Scanner;

public class UserInput {

    public static double inputDouble(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.print(msg);
        return scan.nextDouble();
    }
}
