package com.stayready;

import java.util.Arrays;

public class Problem02
{
    public static int longestContiguous(int[] arr)
    {

        if(arr.length == 0)
        {
            return 0;
        }
        Arrays.sort(arr);
        int tempSequence = 1;
        int lenSequence = 1;


        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] < arr[i + 1] && Math.abs(arr[i] - arr[i + 1]) == 1)
            {
                tempSequence++;
                lenSequence = Math.max(lenSequence, tempSequence);
            }
            else
            {
                tempSequence = 1;
            }
        }

        return lenSequence;
    }
}
