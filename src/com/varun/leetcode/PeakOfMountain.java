package com.varun.leetcode;

public class PeakOfMountain {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};

        System.out.println(peakIndexInMountainArray(array));
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start, end;
        start =0;
        end = arr.length-1;

        while (start < end ){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                //possibly the peak of the array
                //check on the left of mid elem for any greater element
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start; // start and end are equal
    }
}
