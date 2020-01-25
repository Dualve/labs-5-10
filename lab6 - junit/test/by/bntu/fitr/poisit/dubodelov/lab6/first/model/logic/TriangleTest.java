package by.bntu.fitr.poisit.dubodelov.lab6.first.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void checkTriangle(){
        int a = 2;
        int b = 3;
        int c = 4;

        boolean actual = Triangle.checkTriangle(a,b,c);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangle1(){
        int a = 0;
        int b = 1;
        int c = 1;

        boolean actual = Triangle.checkTriangle(a,b,c);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangle2(){
        int a = -1;
        int b = 1;
        int c = 1;

        boolean actual = Triangle.checkTriangle(a,b,c);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangle3(){
        int a = 1000;
        int b = 1;
        int c = 1;

        boolean actual = Triangle.checkTriangle(a,b,c);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangle4(){
        int a = 0;
        int b = 0;
        int c = 0;

        boolean actual = Triangle.checkTriangle(a,b,c);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangle5(){
        int a = -1;
        int b = -6;
        int c = -4;

        boolean actual = Triangle.checkTriangle(a,b,c);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }
}
