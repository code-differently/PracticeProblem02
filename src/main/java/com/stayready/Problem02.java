package com.stayready;

import java.util.Arrays;
import java.util.HashSet;

public class Problem02 {
    //Creates a HashSet and goes through input array and adds into the HashSet
    public HashSet<Integer> addIntoHash(int[] array){
        HashSet<Integer> hash = new HashSet<>();
        for(int num: array){
            hash.add(num);
        }
        return hash;
    }

    public String continuousSubarray(int[] array){
        String output = "";
        HashSet<Integer> hash = addIntoHash(array);

        int result = 0;
        //Goes through each number in the input array and increments the count value
        // While the hash has the decremented current value or incremented current value, it is removed
        for(int currentNum: array){
            int count = 1;
            int decrement = currentNum-1;
            while(hash.contains(decrement)){
                hash.remove(decrement);
                decrement--;
                count++;
            }
            int increment = currentNum+1;
            while(hash.contains(increment)){
                hash.remove(increment);
                increment++;
                count++;
            }
            result = Math.max(result, count);

        }
        output = "Length of the longest contiguous subarray is " + result;
        return output;
    }

}
