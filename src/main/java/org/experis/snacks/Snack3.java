package main.java.org.experis.snacks;

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int arrLength = sc.nextInt();

        int[] numArr = new int[arrLength];

        int res = 0;
        // fill array with numbers, sum only odd numbers
        for (int i = 0; i < arrLength; i++) {
            numArr[i] = i;
            res += i % 2 != 0 ? i : 0;
        }
        System.out.println(res);
    }
}
