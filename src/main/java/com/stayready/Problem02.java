package com.stayready;


import java.util.ArrayList;
import java.util.Arrays;

public class Problem02 {

    private Integer [] arr;
    private Integer longestSubArry;
    private ArrayList<Integer> subArrayCounter;

    public static void main(String [] args) {

        Problem02 temp = new Problem02();
        Integer [] arr = new Integer[]{ 10, 12, 11, 14, 15, 16, 17, 18};
        temp.setArr(arr);
        temp.sortArr();
        temp.countSubArrysLength();
        temp.findLongestSubArry();
        System.out.println("Length of the longest contiguous subarray is " + temp.getLongestSubArry());

    }

    public Problem02() {
        arr = new Integer[50];
        subArrayCounter = new ArrayList<Integer>();
        longestSubArry = 0;
    }


    public void countSubArrysLength() {

        int count = 1;
        for(int i = 0; i < getArr().length-1; i++) {

            if(getArr()[i + 1] == getArr()[i]+1){

                count++;
            } else {

                updateSubArrayCounter(count);
                count = 1;

            }
        }
        updateSubArrayCounter(count);
    }

    public void findLongestSubArry() {

        longestSubArry = getSubArrayCounter().get(0);
        for(int i = 0; i < getSubArrayCounter().size(); i++) {

            if(longestSubArry < getSubArrayCounter().get(i)){

                longestSubArry = getSubArrayCounter().get(i);
            }
        }

    }

    private void updateSubArrayCounter(int x) {

        subArrayCounter.add(x);
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    public void sortArr(){

        Arrays.sort(getArr());
    }

    public Integer[] getArr() {
        return arr;
    }

    public ArrayList<Integer> getSubArrayCounter() {
        return subArrayCounter;
    }


    public Integer getLongestSubArry() {

        return longestSubArry;
    }


}
