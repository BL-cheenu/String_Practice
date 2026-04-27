package com.string.practice;

import java.util.Scanner;

public class _001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your char: ");
        String input = scanner.next();

        if (!input.isEmpty()){
            char ch = Character.toLowerCase(input.charAt(0));
            if (isVowel(ch)){
                System.out.println("The give char is vowel: " + ch);
            }else {
                System.out.println("The give char is not a vowel: " + ch);

            }
        }else{
            System.out.println("Please, enter a value.");
        }

    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

