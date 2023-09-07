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


    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i]==chars[j]) {
                    chars[j]=0;
                }
            }
        }

        System.out.println(Arrays.toString(chars));
        for (char aChar : chars) {
            if (aChar!=0) {
                count++;
            }
        }


        return count;
    }







    public static void main(String[] args) {
        /*int[] nums = new int[]{2,7,11,15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));*/

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }
}
