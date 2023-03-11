package com.varun;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search Algorithm");

        Scanner input = new Scanner(System.in);

        int[] array = new int[]{-102, -67, -45, -23, 23, 34, 56, 67, 78, 89, 203};
        //array has to be sorted first

        System.out.println(Arrays.toString(array));

        System.out.print("Enter the number you want to search: ");
//        int elem = input.nextInt();
        int elem = 67;

        System.out.println(binarySearch(array, elem));


    }

    static int binarySearch(int[] array, int elem) {
        int start, end;
        start = 0;
        end = array.length - 1;

        //return the index
        while (start <= end) {
            //find mid
            //might be possible that start + end exceeds range of integer
            int mid = start + (end - start) / 2; //same as (start+end)/2 but more efficient

            if (elem < array[mid]) {
                end = mid + 1;
            } else if (elem > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        //return -1 if it does not exist
        return -1;


    }
}
