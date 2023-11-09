package com.teachmeskills.lesson_03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number " + a + " is even");
        } else {
            System.out.println("Number " + a + " is odd");
        }
    }
}
