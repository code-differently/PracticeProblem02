package com.stayready;

import java.util.Arrays;

public class Problem02 
{


    public Problem02()
    {
        
    }

    public Integer findLongest(Integer [] input)
    {
        //Int object to compare against longest when it restarts
        int compare = 1;
        int longest = 0;
        Arrays.sort(input);
        for (int i = 0; i < input.length-1;i++)
        {
            if(input[i]+1 == input[i+1])
            {
                compare++;
                if (compare > longest)
                {
                    longest = compare;
                }
                
            }
            else
            {
                compare = 1;
            }
        }
        

        System.out.println("Length of the longest subarray is "+longest);
        return longest;
    }

    
}
