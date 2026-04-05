package com.itshaala.Array_Java;

public class FirstMax {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70};
        int max = array[0];

        for(int i=0; i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }

        }
        System.out.println(max);
    }
}
