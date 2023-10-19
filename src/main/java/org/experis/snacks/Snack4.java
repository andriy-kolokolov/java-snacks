package main.java.org.experis.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        System.out.println("Type a word or a phrase to check if palindrome. Try: 'Do geese see God?': ");
        System.out.println(
                isPalindrome(new Scanner(System.in).nextLine()) ? "Is palindrome" : "Is NOT palindrome"
        );
    }

    public static boolean isPalindrome(String str) {
        // regex used to handle punctuation
        return str.toLowerCase().replaceAll("[^a-z0-9]", "")
                .contentEquals(new StringBuilder(str.toLowerCase().replaceAll("[^a-z0-9]", "")).reverse());
    }
}
