package com.teachmeskills.lesson_03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input outside temperature");
        int t = scanner.nextInt();
        if (t > -5 ){
            System.out.println("it is warm outside");
        } else if (t <= -5 && t >= -20 ){
            System.out.println("it is normal outside");
        } else System.out.println("it is cold outside");
    }
}
