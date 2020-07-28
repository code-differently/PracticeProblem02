package com.stayready;
import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void greatestConsecutiveSequenceTest(){
        int [] arr = {10, 12, 11};

        Problem02 tester = new Problem02();

        int expected = 3;
        int actual = tester.greatestConsecutiveSequence(arr);


        Assert.assertEquals(expected, actual);

    }
    @Test
    public void greatestConsecutiveSequenceTest2(){
        int [] arr =  {14, 12, 11, 20};

        Problem02 tester = new Problem02();

        int expected = 2;
        int actual = tester.greatestConsecutiveSequence(arr);


        Assert.assertEquals(expected, actual);

    }
    @Test
    public void greatestConsecutiveSequenceTest3(){
        int [] arr = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

        Problem02 tester = new Problem02();

        int expected = 5;
        int actual = tester.greatestConsecutiveSequence(arr);


        Assert.assertEquals(expected, actual);

    }
    @Test
    public void greatestConsecutiveSequenceTest4(){
        int [] arr = {1};

        Problem02 tester = new Problem02();

        int expected = 1;
        int actual = tester.greatestConsecutiveSequence(arr);


        Assert.assertEquals(expected, actual);

    }


}
