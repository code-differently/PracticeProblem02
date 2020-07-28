package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestContiguousSubArrayLengthTest {
    private LargestContiguousSubArrayLength contiguousSubArray;

    @Before
    public void setup() {
        contiguousSubArray = new LargestContiguousSubArrayLength();
    }

    @Test
    public void longestArrayZeroElementTest() {
        int expectedLength = 0;

        int actualLength = contiguousSubArray.findLargestArrayLength();

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void longestArrayOneElementTest() {
        int expectedLength = 1;

        int actualLength = contiguousSubArray.findLargestArrayLength(1);

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void longestArrayTwoElementAlreadySortedTest() {
        int expectedLength = 2;

        int actualLength = contiguousSubArray.findLargestArrayLength(1, 2);

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void longestArrayTwoElementNotSortedTest() {
        int expectedLength = 2;

        int actualLength = contiguousSubArray.findLargestArrayLength(2, 1);

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void moreThanTwoElementsNotSortedTest() {
        int expectedLength = 3;

        int actualLength = contiguousSubArray.findLargestArrayLength(10, 12, 11);

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void moreThanTwoElementsNotSortedTest2() {
        int expectedLength = 2;

        int actualLength = contiguousSubArray.findLargestArrayLength(14, 12, 11, 20);

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void moreThanTwoElementsNotSortedTest3() {
        int expectedLength = 5;

        int actualLength = contiguousSubArray.findLargestArrayLength(1, 56, 58, 57, 90, 92, 94, 93, 91, 45);

        Assert.assertEquals(expectedLength, actualLength);
    }
}
