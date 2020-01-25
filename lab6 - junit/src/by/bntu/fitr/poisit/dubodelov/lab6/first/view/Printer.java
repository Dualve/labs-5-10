package by.bntu.fitr.poisit.dubodelov.lab6.first.view;

public class Printer {

    private static final String MSG1 = new String("Is there a triangle with sides : ");
    private static final String MSG2 = new String(" ? - ");
    private static final String MSG3 = new String(" ");

    public static void printInfo(double a, double b, double c, boolean check){
        System.out.println(MSG1 + a + MSG3 + b + MSG3 + c + MSG2 + check );
    }
}
