package com.varun;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();

        int sum = first+second;
        System.out.println("Sum = " + sum);
    }
}
