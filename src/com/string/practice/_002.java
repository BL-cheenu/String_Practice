package com.string.practice;

import java.util.Scanner;

public class _002 {
    // Check whether a character is an alphabet or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value: ");

        String input = scanner.next();
        if (!input.isEmpty()) {
            char ch = Character.toLowerCase(input.charAt(0));
            if (Character.isAlphabetic(ch)) {
                System.out.println("Yes, it is alphabet.");
            } else {
                System.out.println("No, it is not alphabet.");
            }
        }
    }
}
