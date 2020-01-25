package by.bntu.fitr.poisit.dubodelov.lab7.first.utils;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static double input(String msg) {
        System.out.print(msg);
        return scanner.nextDouble();
    }
}
