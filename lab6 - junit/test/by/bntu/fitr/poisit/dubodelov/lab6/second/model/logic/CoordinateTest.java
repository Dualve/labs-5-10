package by.bntu.fitr.poisit.dubodelov.lab6.second.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest{

    @Test
    public void checkCoordinate(){
        double x = 10d;
        double y = 10d;

        boolean actual = Coordinate.checkCoordinate(x,y);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkCoordinate1(){
        double x = -10d;
        double y = 10d;

        boolean actual = Coordinate.checkCoordinate(x,y);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkCoordinate2(){
        double x = 10d;
        double y = -10d;

        boolean actual = Coordinate.checkCoordinate(x,y);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    public void checkCoordinate3(){
        double x = -10d;
        double y = -10d;

        boolean actual = Coordinate.checkCoordinate(x,y);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkCoordinate0(){
        double x = 0d;
        double y = 0d;

        boolean actual = Coordinate.checkCoordinate(x,y);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }
}
