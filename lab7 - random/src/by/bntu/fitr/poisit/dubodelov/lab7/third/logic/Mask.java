package by.bntu.fitr.poisit.dubodelov.lab7.third.logic;

public class Mask {

    private static final String MASK1 = "( ͡° ͜ʖ ͡°)";
    private static final String MASK2 = "(ಠ_ಠ)";
    private static final String MASK3 = "༼ • ʖ̯ • ༽";

    public static String chooseMask(int item) {

        String mask = MASK3;

        if (item == 1){
            mask =  MASK1;
        }
        else if(item == 2){
            mask =  MASK2;
        }
        return mask;
    }

}
