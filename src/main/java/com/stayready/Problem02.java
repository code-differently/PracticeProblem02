package com.stayready;

import java.util.Arrays;

public class Problem02 {

    public boolean isContiguous (int num1, int num2) {
        if (Math.abs(num1 - num2) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int longestContiguousSubArray(int[] nums) {
        Arrays.sort(nums);
        int currentCount = 1;
        int maxCount = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (isContiguous(nums[i], nums[i - 1])) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }

    public String displayOutput(int num) {
        return "Length of the longest contiguous subarray is " + num;
    }
}
