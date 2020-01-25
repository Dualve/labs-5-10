package by.bntu.fitr.poisit.dubodelov.lab8.second.view;

public class Printer {

    public static void printInfo(String msg1, String msg2, String msg3, double a, double fullSquare, double volume) {
        System.out.println(msg1 + a + msg2 + fullSquare + msg3 + volume);
    }

    public static void printError(String msg){
        System.out.println(msg);
    }
}

