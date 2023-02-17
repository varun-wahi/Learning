package com.varun.leetcode;

import java.util.Arrays;
import java.util.Scanner;

class Floor{
    public static void main(String[] args) {
        int[] arr = new int[]{23,45,67,78,89,90,340};
        System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find it Floor value: ");
        int elem = in.nextInt();

        int answer = floor(arr, elem);
        System.out.println(answer);
    }

    static int floor(int[] arr, int elem){

        int start, end;
        start =0;
        end = arr.length-1;



        while(start<=end){
            int mid = start +(end-start)/2;
            if(elem < arr[mid]){end = mid-1;}
            else if(elem > arr[mid]){start = mid+1;}
            else {
                return arr[mid];
            }
        }
        return arr[end];

    }
}