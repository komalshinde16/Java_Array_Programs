package com.itshaala.Array_Java;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,1};
        boolean isPalindrome = true;

        for(int i=0; i< array.length/2; i++){
            if(array[i]!= (array[array.length-1-i])){

                isPalindrome= false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
