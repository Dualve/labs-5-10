package by.bntu.fitr.poisit.dubodelov.lab6.second.view;

public class Printer {

    private static final String MSG1 = new String("Does the point with coordinates ");
    private static final String MSG2 = new String(" lie in the 1st quarter? - ");
    private static final String MSG3 = new String(" ");

    public static void printInfo(double x, double y, boolean checker){
        System.out.println(MSG1 + x + MSG3 + y + MSG2 + checker);
    }

}
