package com.stayready;
import java.util.Arrays;
import java.lang.Integer;


public class Problem02 {

    public int greatestConsecutiveSequence(int[] arr) {

            int ans = 0, count = 0;

            Arrays.sort(arr);
            
            for (int i = 0; i < arr.length; i++) {

                if (i > 0 && arr[i - 1] == arr[i] - 1)
                    count++;
                else
                    count = 1;

                ans = Integer.max(ans, count);
            }
            return ans;
        }


}
