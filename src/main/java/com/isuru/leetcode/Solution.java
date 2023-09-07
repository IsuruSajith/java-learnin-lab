package com.isuru.leetcode;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target ) {

        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j]==target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }
}
