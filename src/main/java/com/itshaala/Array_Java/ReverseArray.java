package com.itshaala.Array_Java;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        for(int i= array.length-1; i>=0; i--){
            System.out.print(array[i]+ " ");
        }
    }
}
