package com.string.practice;

import java.util.Scanner;

public class _004 {
    // Length of the string without using strlen() function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();

        int count = 0;
        for (char ch : input.toCharArray()) {
            count++;
        }
        System.out.println("Length of the given string: " + count);
    }
}
