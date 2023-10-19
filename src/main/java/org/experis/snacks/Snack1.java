package main.java.org.experis.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int input;

        while ((input = new Scanner(System.in).nextInt()) > 0) {
            System.out.println(input % 2 == 0 ? input : input + 1);
        }
        System.out.println("Negative number or '0' found in input. Exit...");
    }
}
