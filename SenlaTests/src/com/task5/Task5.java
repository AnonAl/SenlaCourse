package com.task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    private int num;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Task5().run();
    }

    private void run() {
        try {
            System.out.println("Enter the num:");
            num = scanner.nextInt();
            if (num > 100 || num < 0) {
                System.out.println("Error! num should be <= 100");
                return;
            }
            for (int i = 0; i < num; i++) {
                if (isPalindrome(i)) {
                    System.out.println(i);
                }
            }
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Error! Enter the correct value.");
        }

    }

    private static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse;
    }
}
