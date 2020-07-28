package com.stayready;

import java.util.Arrays;

public class Problem02 {
    public Integer continuousSequence(int[] numArray){
        int loopCounter = 1;
        int resultCounter = 0;
        Arrays.sort(numArray);
        for(int i = 1; i < numArray.length; i++){
            if(numArray[i] - 1 == numArray[i-1]){
                loopCounter++;
            }
            else{
                loopCounter = 1;
            }
            if(resultCounter < loopCounter){
                resultCounter = loopCounter;
            }
        }

        return resultCounter;

    }
}
