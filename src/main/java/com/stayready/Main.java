package com.stayready;

import java.util.Arrays;

public class Main 
{
    public static void main(String [] args)
    {
        Problem02 pb2 = new Problem02();
        Integer arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        pb2.findLongest(arr);
        
    }
}