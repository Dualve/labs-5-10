package by.bntu.fitr.povt.dubodelov.lab6.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class DayTest {
    @Test
    public void testCountDay7() {
        int day = 7;
        int expected = 0;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDay6() {
        int day = 6;
        int expected = 6;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDay5() {
        int day = 5;
        int expected = 5;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDay4() {
        int day = 4;
        int expected = 4;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDay3() {
        int day = 3;
        int expected = 3;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDay2() {
        int day = 2;
        int expected = 2;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDay1() {
        int day = 1;
        int expected = 1;

        int actual = Day.countDay(day);
        Assert.assertEquals(expected, actual);
    }
}
