package by.bntu.fitr.poisit.dubodelov.lab6.third.model.logic;

public class Sequence {

    private static final int COAF1 = 100;
    private static final int COAF2 = 10;
    private static final int COAF3 = 1000;


    public static boolean checkSequence(int num){
        return (num/COAF3 < num/COAF1%COAF2 &&  num/COAF1%COAF2 < num/COAF2%COAF2 && num/COAF2%COAF2 < num%COAF2);
    }

}
