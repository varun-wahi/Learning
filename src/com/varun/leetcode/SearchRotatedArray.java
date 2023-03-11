package com.varun.leetcode;

public class SearchRotatedArray {
    //Rotated Binary Search Algorithm
    public static void main(String[] args) {
        int[] array = {7,8,9,1,2,3,4};

        int target = 2;
        System.out.println(search(array, target));
    }
    public static int search(int[] nums, int target) {
        int pivot = peakIndexInMountainArray(nums);

        int firstTry = binarySearch(nums, target, pivot+1, nums.length-1);
        if(firstTry != -1){
            System.out.println(firstTry);
            return firstTry;
        }else {
            int secondTry = binarySearch(nums, target,0, pivot);
            System.out.println(secondTry);
            return secondTry;
        }
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        //return the index
        while (start <= end) {
            //find mid
            //might be possible that start + end exceeds range of integer
            int mid = start + (end - start) / 2; //same as (start+end)/2 but more efficient

            if (target < arr[mid]) {
                end = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        //return -1 if it does not exist
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
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
        System.out.println("Peak: "+start);
        return start; // start and end are equal
}}
