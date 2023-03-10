package com.varun;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
       int[] arr;
       arr = new int[]{2, 4, 1, 23, 567, 78};
       System.out.println(Arrays.toString(arr));
       bubbleSort(arr);
    }

    private static void bubbleSort(int[] array){
        for(int i=0; i< array.length; i++) {
            boolean swapped =false;

            for(int j = 1; j<array.length - i; j++){
                if (array[j] > array[j-1]) {
                    //swap
                    System.out.println("Swap elements");
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
