package com.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    private int num;
    private Scanner scanner = new Scanner(System.in);
    private int primeCheckIterator = 2;

    public static void main(String[] args) {
        new Task1().run();
    }

    private void run() {
        try {
            System.out.println("Enter an integer:");
            num = scanner.nextInt();
            parityCheck();
            primeCheck(num);
        } catch (InputMismatchException e) {
            System.out.println("Error! Enter the correct value.");
        }
    }

    private void parityCheck() {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    private void primeCheck(int num) {
        if (num > 1) {
            if (num % primeCheckIterator != 0) {
                primeCheckIterator++;
                primeCheck(num);
            } else if (num % primeCheckIterator == 0) {
                printInf(primeCheckIterator, num);
            }
            primeCheckIterator = 2;
        }
    }


    private void printInf(int count, int num) {
        if (num == count && num != 1 && num != 0) {
            System.out.println("The number is prime ");
        } else {
            System.out.println("Composite number ");
        }
    }
}