package by.bntu.fitr.poisit.dubodelov.lab7.second.logic;

import by.bntu.fitr.poisit.dubodelov.lab7.first.logic.Greatest;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {


    @Test
    public void testCheckResult() {
        int num1 = 1;
        int num2 = 1;

        double expected = 2d;
        double actual = Dice.checkResult(num1, num2);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

}
