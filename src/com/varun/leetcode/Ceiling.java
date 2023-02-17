package com.varun.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Ceiling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[] {2,3,5,7,8,10};
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the number to find it's ceiling: ");
        int target = in.nextInt();
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] array, int target){
        int start = 0;
        int end = array.length-1;

            while (start <= end) {
                //find mid
                //might be possible that start + end exceeds range of integer
                int mid = start + (end - start) / 2; //same as (start+end)/2 but more efficient

                if (target < array[mid]) {
                    end = mid - 1;
                    System.out.println("target<mid");
                } else if (target > array[mid]) {
                    start = mid + 1;
                    System.out.println("target>mid");
                } else {
                    System.out.println("returning mid");
                    return mid;
                }

            }
        return array[start];
    }
}

