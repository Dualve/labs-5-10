package by.bntu.fitr.poisit.dubodelov.lab7.first.logic;

import org.junit.Assert;
import org.junit.Test;

public class GreatestTest {

    @Test
    public void testCheckGreatest1() {
        double num1 = 1d;
        double num2 = 1d;
        double num3 = 1d;
        double num4 = 2d;

        double expected = 2d;
        double actual = Greatest.checkGreatest(num1, num2, num3, num4);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testCheckGreatest2() {
        double num1 = 1d;
        double num2 = 1d;
        double num3 = 2d;
        double num4 = 1d;

        double expected = 2d;
        double actual = Greatest.checkGreatest(num1, num2, num3, num4);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testCheckGreatest3() {
        double num1 = 1d;
        double num2 = 2d;
        double num3 = 1d;
        double num4 = 1d;

        double expected = 2d;
        double actual = Greatest.checkGreatest(num1, num2, num3, num4);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

    @Test
    public void testCheckGreatest4() {
        double num1 = 2d;
        double num2 = 1d;
        double num3 = 1d;
        double num4 = 1d;

        double expected = 2d;
        double actual = Greatest.checkGreatest(num1, num2, num3, num4);

        Assert.assertEquals(Double.compare(expected, actual),0);
    }

}
