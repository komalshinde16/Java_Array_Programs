package com.itshaala.Array_Java;

public class Merge2Arrays {
    public static void main(String[] args) {
        int [] array1 = {10,20,30,40,50,60,70};
        int [] array2 = {80,90,100};

        int[] merged= new int[array1.length+array2.length];

        for(int i=0; i< array1.length; i++){
            merged[i] = array1[i];
        }
        for(int i=0; i<array2.length; i++){
            merged[array1.length+i] = array2[i];
        }

        for(int i=0; i<merged.length;i++){
            System.out.print(merged[i]+ " ");
        }
    }
}
