package com.string.practice;

import java.util.Scanner;

public class _005 {
    // Toggle each character in a string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value here: ");

        String input = scanner.nextLine();
        StringBuffer result = new StringBuffer();

        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }

        }
        System.out.println("Toggle String: " + result);
    }
}
