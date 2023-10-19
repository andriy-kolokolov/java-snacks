package main.java.org.experis.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        System.out.println("Insert seconds to convert in dateTime format");
        System.out.println(getTimeString(new Scanner(System.in).nextInt()));
    }

    public static String getTimeString(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}
