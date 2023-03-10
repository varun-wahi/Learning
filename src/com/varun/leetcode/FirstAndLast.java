package com.varun.leetcode;

import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {
        int[] arr = {2,6,7,7,7,7,8,9};
        int target = 7;
        searchRange(arr, target);
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans  = {-1,-1};

        //check for first occurrence if target first
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        ans[0] = start;
        ans[1] = end;


        System.out.println(Arrays.toString(ans));
        return ans;
    }

    static int Search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                //potential answer found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;

    }
}
