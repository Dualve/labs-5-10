package by.bntu.fitr.povt.dubodelov.lab6.utils;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int input(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
}
