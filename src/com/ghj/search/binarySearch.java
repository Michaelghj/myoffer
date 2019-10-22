package com.ghj.search;

public class binarySearch {
    public int binarysearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start<=end){
            int mid = (start+end)/2;
            if (mid == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid  +  1;
            }else {
                end = mid - 1;
            }
        }
    }
}
