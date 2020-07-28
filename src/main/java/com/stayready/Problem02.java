package com.stayready;

import java.util.HashSet;

public class Problem02 
{   

    public static int longestContSubarray(int array[])
    {   
        int result = 0 ;
        int length = array.length;
        HashSet<Integer> arraySet = new HashSet<Integer>(); 

        for (int i = 0; i < length; ++i) 
        {
            arraySet.add(array[i]); 
        }

        for (int i = 0; i < length; i++) 
        { 
            if (!arraySet.contains(array[i] - 1))
            { 
                int j = array[i]; 
                while (arraySet.contains(j))
                {
                    j++; 
                } 
                   
                if (result < j - array[i])
                {
                    result = j - array[i]; 
                }
                    
            } 
        } 
        return result; 

    }

    public static void main(String[] args) //main method tester
{       
    int array[] = { 8, 23, 56, 22, 100}; 
        System.out.println( 
            "Length of the longest contiguous subarray is" + longestContSubarray(array)); 
}

}