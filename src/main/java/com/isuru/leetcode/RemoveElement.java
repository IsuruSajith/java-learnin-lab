package com.isuru.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[5];
       int k=0;
       int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==k) {
                count++;
                nums[i]=51;
            }
        }
        Arrays.sort(nums);

    }
}
