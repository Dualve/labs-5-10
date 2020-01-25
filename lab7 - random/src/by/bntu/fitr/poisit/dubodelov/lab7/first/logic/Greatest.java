package by.bntu.fitr.poisit.dubodelov.lab7.first.logic;

public class Greatest {

    public static double checkGreatest(double a, double b, double c, double d) {

        double greatest = a;

        if (b > a && b > c && b > d) {
            greatest = b;
        } else if (c > a && c > d) {
            greatest = c;
        } else if (d > a) {
            greatest = d;
        }

        return greatest;


    }

}
