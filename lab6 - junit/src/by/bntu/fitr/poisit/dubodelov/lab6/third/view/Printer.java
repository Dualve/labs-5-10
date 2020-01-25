package by.bntu.fitr.poisit.dubodelov.lab6.third.view;

public class Printer {

    private static final String MSG = new String(" is an increasing sequence? - ");

    public static void printInfo(int num, boolean checker){
        System.out.println(num + MSG + checker);
    }
}
