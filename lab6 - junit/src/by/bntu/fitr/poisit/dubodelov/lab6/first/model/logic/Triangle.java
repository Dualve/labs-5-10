package by.bntu.fitr.poisit.dubodelov.lab6.first.model.logic;

//Design a program that checks that the numbers a, b, and c are indeed
//are sides of a triangle.

public class Triangle {

    public static boolean checkTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

}