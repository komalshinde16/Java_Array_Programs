package com.itshaala.Array_Java;

public class FirstMin {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70};

        int min = array[0];

        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
