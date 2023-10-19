package main.java.org.experis.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        /*
         * Convert string to integer using ASCII values for Char to Int Conversion
         * https://www.geeksforgeeks.org/java-program-to-convert-char-to-int/
         */

        System.out.println("Insert number AS STRING to convert it in integer");
        System.out.println(stringToInt(
                new Scanner(System.in).nextLine()
        ));
    }

    public static int stringToInt(String string) {
        char[] chars = string.toCharArray();
        int res = 0;

        for (int i = 0; i < string.length(); i++) {
            // converting character to its integer value
            res = res * 10 + chars[i] - '0';
        }
        return res;
    }
}
