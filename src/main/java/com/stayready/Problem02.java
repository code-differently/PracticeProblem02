package com.stayready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Problem02 {



    public static List<Integer> sort(Integer[] ary){

        List<Integer> sortedList = Arrays.asList(ary);

        Collections.sort(sortedList);

        return sortedList;

    }

    public static int findChain(Integer[] ary){

        List<Integer> sortedList = sort(ary); //Sort and convert to arylist

        int chainCnt = 0;
        int maxChain = 0; //registers when chain is broken

        for(int i = 0; i < sortedList.size()-1; i++){
            System.out.println(maxChain);

            //If next value equals current value + 1
            if((sortedList.get(i))+1 == sortedList.get(i+1)){

                chainCnt++;

                if(chainCnt + 1 > maxChain){ //new record

                    maxChain = chainCnt + 1;

                    //IMPORTENT: +1 accounts for the current value itself!!
                
                }

                
            }else{
                
                chainCnt = 0; //reset. Makes it possible for zero matches.
            }

        }




        return maxChain;
    }
}
