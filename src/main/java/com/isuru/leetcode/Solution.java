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
        int count = 1;
        int[] countArray = new int[0];
        char[] chars = s.toCharArray();
        if (s==" ") {
            return 1;
        }
        if (chars.length==0) {
            return 0;
        }
        //System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            count=1;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] != chars[j]) {
                    count++;
                } else {
                    int[] temp = new int[countArray.length + 1];
                    temp[countArray.length]=count;
                    for (int k = 0; k < countArray.length; k++) {
                        temp[k] = countArray[k];
                    }
                    count=1;
                    countArray = temp;
                }
            }
        }
        int max=0;
        for (int i : countArray) {
            if (i>max) {
                max=i;
            }
        }

        //System.out.println(Arrays.toString(countArray));
        return max;
    }



    public static void main(String[] args) {
        /*int[] nums = new int[]{2,7,11,15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));*/

        /*System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));*/
        /*System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));*/
        System.out.println(lengthOfLongestSubstring("au"));

    }
}
