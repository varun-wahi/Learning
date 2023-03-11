package com.varun.leetcode;

public class FindInMountain {
    public static void main(String[] args) {

    }
    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr, target);
        int firstTry = binarysearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }else {
            int secondTry = binarysearch(arr, target,peak+1, arr.length-1);
            return secondTry;
        }
    }
    public int binarysearch(int[] array, int elem, int start, int end){

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
    public int peakIndexInMountainArray(int[] arr, int target){
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
