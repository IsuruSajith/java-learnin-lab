package com.isuru.leetcode;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[]nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[]nums2 = new int[]{2,5,6};
        int n = 3;

        if (nums1.length >= m && nums2.length >= n) {
            int[] mergeArray = new int[m + n];
            for (int i = 0; i < m; i++) {
                mergeArray[i] = nums1[i];
            }
            for (int i = m; i < m + n; i++) {
                mergeArray[i] = nums2[i - m];
            }

            for (int i = 0; i < mergeArray.length; i++) {
                int min = mergeArray[i];
                for (int j = i+1; j < mergeArray.length; j++) {
                    if (mergeArray[j]<min) {
                        min = mergeArray[j];
                        mergeArray[j] = mergeArray[i];
                        mergeArray[i]=min;
                    }
                }
            }
            System.out.println(Arrays.toString(mergeArray));
        }


    }
}
