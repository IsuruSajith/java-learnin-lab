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

//----------------------------------------------------------//
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
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length-1; i++) {
            count=1;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] != chars[j]) {
                    count++;
                    int[] temp = new int[countArray.length + 1];
                    temp[countArray.length]=count;
                    for (int k = 0; k < countArray.length; k++) {
                        temp[k] = countArray[k];
                    }
                    countArray = temp;
                } else {
                    int[] temp = new int[countArray.length + 1];
                    temp[countArray.length]=count;
                    for (int k = 0; k < countArray.length; k++) {
                        temp[k] = countArray[k];
                    }
                    count=1;
                    countArray = temp;
                }

                /*int[] temp = new int[countArray.length + 1];
                temp[countArray.length]=count;
                for (int k = 0; k < countArray.length; k++) {
                    temp[k] = countArray[k];
                }
                count=1;
                countArray = temp;*/

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

//-----------------------------------------------------------------//


    /*Given a sorted array of distinct integers and a target value,
    return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.*/


    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }
            if (nums[0]>target) {
                return 0;
            }
            if ((i + 1) != nums.length) {
                if (nums[i] < target && nums[i + 1] > target) {
                    return i + 1;
                }
            } else {
                return nums.length;
            }
        }

        return 0;
    }

    //---------------------------------------------//
        public static   int firstBadVersion(int n) {
            int left = 1;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
        private static boolean isBadVersion(int version) {
            if (version < 1702766719) {
                return false;
            } else {
                return true;
            }
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
       /* System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));*/

       /* System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 1));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));*/

        System.out.println(firstBadVersion(2126753390));


    }
}
