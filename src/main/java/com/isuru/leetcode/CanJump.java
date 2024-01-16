package com.isuru.leetcode;

public class CanJump {
    public static void main(String[] args) {
        boolean jump = false;
        int distance = 1;
        int[] nums = new int[]{1, 3, 6, 8, 2, 4, 3, 6, 0, 2, 9, 0};
        //int[] nums = new int[]{0,2,3};
       /* if (nums.length==1) {
            return false;
        }*/
        while (distance < nums.length) {

            if (distance + 1 == nums.length) {
                jump = true;
                break;
            }
            if (nums[distance] == 0) {
                break;
            }
            distance = distance + nums[distance];
        }
        System.out.println(jump);
        myClass();

        CanJump canJump = new CanJump();
        canJump.myClass2();
    }

    public static void myClass() {
        System.out.println("my class");
    }
    public void myClass2() {
        System.out.println("my class 2");
    }

}
