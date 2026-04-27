package com.string.practice;

import java.util.Scanner;

public class _010 {
    // Remove all characters from string except alphabets
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        if (!input.isEmpty()) {
            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    result.append(ch);
                }
            }
            System.out.println("Remove all characters from string except alphabets: " + result);
        } else {
            System.out.println("Please, enter a value.");
        }
    }
}
