package com.varun.practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        for(int i=0; i<num+1; i++){
            System.out.print("^");
        }
        System.out.println();
    }
}
