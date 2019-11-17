package com.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    private String text, word;
    private List<String> list;
    private Scanner scanner = new Scanner(System.in);
    private int count = 0;

    public static void main(String[] args) {
        new Task4().run();
    }

    private void run() {
        System.out.println("Enter the text:");
        text = scanner.nextLine();
        text = text.trim().replaceAll("\\s{2,}", " ");
        list = Arrays.asList(text.split(" "));
        System.out.println("Enter the word: ");
        word = scanner.nextLine();
        for (String str : list) {
            if (str.equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println("Word includes: " + count + " times");
    }

}
