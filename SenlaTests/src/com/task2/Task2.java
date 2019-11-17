package com.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    private int num1, num2;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Task2().run();
    }

    private void run() {
        try {
            System.out.println("Input the first value: ");
            num1 = scanner.nextInt();
            System.out.println("Input the second value: ");
            num2 = scanner.nextInt();
            System.out.println("NOD: " + nodOfNum(num1, num2));
            System.out.println("NOK: " + nokOfNum(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Error! Enter the correct value.");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private int nokOfNum(int num1, int num2) {
        int val = 0;
        val = (num1 / nodOfNum(num1, num2) * num2);
        return Math.abs(val);
    }

    private int nodOfNum(int num1, int num2) {
        int val;
        while (num2 != 0) {
            val = num2;
            num2 = num1 % num2;
            num1 = val;
        }
        return Math.abs(num1);
    }
}
