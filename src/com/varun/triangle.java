package com.varun;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of levels in the triangle: ");
        int max = in.nextInt();

        for(int i=0; i<max; i++){
            System.out.println("*".repeat(i));
        }
    }
}
