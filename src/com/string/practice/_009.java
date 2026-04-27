package com.string.practice;

import java.util.Scanner;

public class _009 {
    // Print the given string in reverse order
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");

        String input = scanner.next();
        StringBuilder result = new StringBuilder();

        if (!input.isEmpty()) {
            for (int i = input.length() - 1; i >= 0; i--) {
                result.append(input.charAt(i));
            }
            System.out.println("Print the given string in reverse order: " + result);
        }else{
            System.out.println("Please, Enter a value.");
        }
    }
}
