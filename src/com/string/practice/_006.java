package com.string.practice;

import java.util.Scanner;

public class _006 {
    // Count the number of vowels
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value here: ");

        String input = scanner.nextLine();
        if (!input.isEmpty()) {

            countVolwels(input.toLowerCase().toCharArray());
        }
    }

    private static void countVolwels(char[] charArray) {
        int count = 0;
        for (char ch : charArray) {
            if (isVowel(ch)) {
                count++;
            }
        }
        System.out.println("Count the number of vowels: " + count);
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
