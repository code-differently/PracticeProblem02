package com.stayready;

import java.util.Arrays;

public class LargestContiguousSubArrayLength {
    public int findLargestArrayLength(int ...array) {
        if(array.length == 0) {
            return 0;
        }
        if(array.length == 1) {
            return 1;
        }
        Arrays.sort(array);
        int maxStreak = findLargestForMoreThanTwo(array);

        return maxStreak;
    }

    private int findLargestForMoreThanTwo(int ...array) {
        int currentNumber = array[0];
        int currentLength = 1;
        int maxLength = 0;

        for(int index = 1; index < array.length; index++) {
            if(array[index] - 1 == currentNumber) {
                currentLength++;
            }
            else {
                currentLength = 1;
            }
            maxLength = Math.max(currentLength, maxLength);
            currentNumber = array[index];
        }
        return maxLength;
    }
}
