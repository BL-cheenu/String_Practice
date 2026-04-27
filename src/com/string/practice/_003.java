package com.string.practice;

import java.util.Scanner;

public class _003 {
    // Find the ASCII value of a character
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value: ");

        String input = scanner.next();
        if (!input.isEmpty()) {
            char ch = input.charAt(0);
            System.out.println("ASCII value of " + ch + " is: " + (int) ch);
        }else{
            System.out.println("Please, enter a value.");
        }

    }
}
