package main.java.org.experis.snacks;

import java.util.Random;
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] names = {"Andrea", "Cristiano", "Roberto", "Marco", "John", "Diego", "Leonardo"};
        String[] lastnames = {"Rossi", "Doe", "Ferrari", "Ronaldo", "Maradonna", "De Niro", "Di Caprio"};

        System.out.println("Enter list length:");
        int count = sc.nextInt();
        int availableNamesLength = 7;

        for (int i = 0; i < count; i++) {
            int randomNameIdx = random.nextInt(availableNamesLength);
            int randomLastnameIdx = random.nextInt(availableNamesLength);

            System.out.println(
                    names[randomNameIdx] + ' ' + lastnames[randomLastnameIdx]
            );
        }
        sc.close();
    }
}
