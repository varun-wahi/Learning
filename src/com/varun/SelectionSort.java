package com.varun;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1,4,45,6,3};
        selectionSort(array);

        System.out.println(Arrays.toString(array));

    }

    static void selectionSort(int[] arr){
        for(int i =0; i< arr.length; i++){
            //find the max item in the remaining array and swap with correct 1
            int last= arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }
    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
