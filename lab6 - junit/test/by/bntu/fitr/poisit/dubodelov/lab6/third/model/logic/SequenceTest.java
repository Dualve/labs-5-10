package by.bntu.fitr.poisit.dubodelov.lab6.third.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class SequenceTest {

    @Test
    public void checkSequence(){
        int num = 1234;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSequence1(){
        int num = 3579;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSequence2(){
        int num = 2134;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSequence3(){
        int num = 2314;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSequence4(){
        int num = 2341;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSequence5(){
        int num = -2341;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSequence6(){
        int num = -1234;

        boolean actual = Sequence.checkSequence(num);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }


}
