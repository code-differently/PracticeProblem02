package com.stayready;

import java.util.Arrays;

public class Problem02 {
    public Integer[] sort(Integer[] array)
    {
        Arrays.sort(array);
        return array;
    }
    Integer maxi(Integer x, Integer y)
    {
        Integer max = 0; 
        if(x>y)
        {
            max = x;
        }
        else
        {
            max = y;
        }
        return max;
    }
    Integer mini(Integer x, Integer y)
    {
        Integer min = 0; 
        if (x>y) 
        {
            min = y;    
        }
        else
        {
            min = x;
        }
        return min;
    }
    Integer findLength(Integer[] array)
    {
        Integer[] sorted = sort(array); //sorted array 
        Integer maximum_length = 1;  //set length 
        for (int i = 0; i < sorted.length-1; i++) 
        {
            Integer minimum = sorted[i]; Integer maximum = sorted[i]; // initialize min and max for subarrays starting with i 
            for (int j = i+1; j < sorted.length; j++) //going the through subarray with i and ending with j
            {
                minimum =mini(minimum, array[j]); //update max and min if needed
                maximum =maxi(maximum, array[j]);
                if ((maximum- minimum) == j-i) //update if subarry has contigous elements 
                {
                    maximum_length = maxi(maximum_length, maximum- minimum +1);
                }
            }   
        }
        return maximum_length;
    }
    }


