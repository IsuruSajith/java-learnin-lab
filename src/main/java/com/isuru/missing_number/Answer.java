package com.isuru.missing_number;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int[] numbers = new int[]{10,9,1, 2, 3, 4, 6, 7, 8,5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter : ");
        int input = scanner.nextInt();

        int missing = 0;
        for (int i = 1; i < numbers.length + 1; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    missing = 0;
                    break;
                } else {
                    missing = i;
                }
            }
            if (missing != 0) {
                System.out.println(missing);
                break;
            }
        }

    }
}
