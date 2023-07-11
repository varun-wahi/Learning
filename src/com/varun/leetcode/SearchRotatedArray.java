package com.varun.leetcode;

public class SearchRotatedArray {
    //Rotated Binary Search Algorithm
    public static void main(String[] args) {
        int[] array = {5,1,3};

        int target = 1;
        System.out.println(search(array, target));
    }
    public static int search(int[] nums, int target) {
        int pivot = peakIndexInMountainArray(nums);
        if(pivot == -1){
            return(binarySearch(nums, target, 0, nums.length-1));
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        System.out.println("Entered Binary Search with target: "+ target);

        //return the index
        while (start <= end) {
            //find mid
            //might be possible that start + end exceeds range of integer
            int mid = start + (end - start) / 2; //same as (start+end)/2 but more efficient

            if (target < arr[mid]) {
                end = mid - 1;
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

            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid> start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("Pivot element: "+start);
        return -1; // start and end are equal
    }
}
