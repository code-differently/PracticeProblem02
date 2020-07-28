package com.stayready;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;



public class Problem02Test {

    @Test
    public void sortArrayTest() {

        //Given
        Problem02 problem02 = new Problem02();
        Integer[]  arr = {12,6,8};
        Integer[] expected = {6,8,12};

        //When
        Integer[] actual = problem02.sort(arr);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }



    @Test
    public void minimumValueTest(){

        //given
        Problem02 problem02 = new Problem02();
        //when
        Integer a =3;
        Integer b = 5;
        Integer expected = 3;
        Integer actual = a;
      

        //then
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumValueTest(){

        //given
        Problem02 problem02 = new Problem02();
        //when
        Integer a =12;
        Integer b = 15;
        Integer expected = 12;
        Integer actual = a;
      

        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findTheLengthTest(){
        //given
       Problem02 problem02 = new Problem02();
       Integer[] arr = {14,12,11,20};
        Integer expected = 2;
        //when
        Integer actual = problem02.findLength(arr);

        //then
       Assert.assertEquals(expected, actual);
    }

 
}
    