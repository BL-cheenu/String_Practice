package com.string.practice;

import java.util.Scanner;

public class _007 {
    // Remove the vowels from a String
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value here: ");

        String input = scanner.nextLine();
        StringBuffer result = new StringBuffer();

        if (!input.isEmpty()) {
            for (char ch : input.toCharArray()) {
                if (!isVowel(ch)) {
                    result.append(ch);
                }
            }
        }
        System.out.println("Remove the vowels from a String: " + result);
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
