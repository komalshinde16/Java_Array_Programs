package com.itshaala.Array_Java;

public class AverageofArray {
    public static void main(String[] args) {
        int [] array = {5,12,1};
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        double average = (double) sum / array.length;
        System.out.println(average);
    }
}
