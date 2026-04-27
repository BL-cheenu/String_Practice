package com.string.practice;

import java.util.Scanner;

public class _008 {
    // Check if the given string is Palindrome or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");

        String input = scanner.next();
        StringBuilder temp = new StringBuilder();
        if (!input.isEmpty()) {
            for (int i = input.length() - 1; i >= 0; i--) {
                temp.append(input.charAt(i));
            }
            if (input.equalsIgnoreCase(temp.toString())){
                System.out.println("Yes, It is palindrome.");
            }else {
                System.out.println("No, It is not a palindrome.");
            }
        } else {
            System.out.println("Please, enter a value to process.");
        }
    }
}
