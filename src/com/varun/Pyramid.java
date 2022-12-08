package com.varun;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int lev = scanner.nextInt();
        for(int i =0; i < lev; i++){
            System.out.println(" ".repeat(lev-i) + "*".repeat(i+1) + "*".repeat(i));
        }
    }
}
