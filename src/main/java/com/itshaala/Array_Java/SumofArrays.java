package com.itshaala.Array_Java;

public class SumofArrays {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70};
        int sum = array[0];

        for(int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("sum of the arrays is: " + sum);
    }
}
