package com.itshaala.Array_Java;

public class SecondMin {
    public static void main(String[] args) {
        int[] array ={10,52,45,12,36,98,14,78};
        int min = array[0];
        int secondMin = array[1];

        for(int i=0; i< array.length;i++){
            if(array[i]>min){
                secondMin = min;
                min = array[i];
            } else if (array[i]>secondMin && array[i]!=min) {
                secondMin = array[i];

            }
        }
        System.out.println(secondMin);
    }
}
