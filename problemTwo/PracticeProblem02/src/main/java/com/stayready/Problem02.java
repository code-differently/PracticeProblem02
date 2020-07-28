package com.stayready;
import java.sql.Array;
import java.util.Arrays;

public class Problem02 {
     
    //find the maximum and the minimum length
  
   public Integer minimum(int x, int y){ 
            Integer minimumValue = 0;
            if( x > y) {
                minimumValue = y;
            } else {
                minimumValue = x;
            }
            return minimumValue;
        } 
    
  
    public Integer maximum(int x, int y)  
    { 
        Integer maximumValue = 0;
        if( x > y) {
            maximumValue = y;
        } else {
            maximumValue = x;
        }
        return maximumValue; 
    } 
  
    //sort the values in order from lowest to highest to find the consecutive numbers

    public Integer[] sort(Integer[] arr) {
        Arrays.sort(arr);
		return arr;
	}

    //find the longest subarray and display the length

    public Integer findLength(Integer[]arr){ 
       
        int maximumlength = 1; 
        Integer number;
        for (int i = 0; i < number - 1; i++)  
        { 
          
 
        } 
        return maximumlength; 
    }


	
	
}
