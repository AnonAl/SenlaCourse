package com.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private Scanner scanner = new Scanner(System.in);
    private int count = 0;
    private String input;

    public static void main(String[] args) {
        new Task3().run();
    }

    private void run() {
        int count = countOfWords();
        System.out.println("Count of words: " + count);
        if (count > 0) {
            System.out.println("Sorted string: " + sortWords());
        }
    }

    private int countOfWords() {
        System.out.println("Input the sentence: ");
        input = scanner.nextLine();
        input = input.trim().replaceAll("\\s{2,}", " ");
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    private String sortWords() {
        String[] split = input.split(" ");
        Arrays.sort(split);
        StringBuilder sorted = new StringBuilder();
        for (String s : split) {
            sorted.append(" ").append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
        }
        return sorted.toString();
    }

}
