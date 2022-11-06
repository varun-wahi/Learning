package com.varun;

public class Recursion {
    public static void main(String[] args) {
        //WAP that takes a number and prints it
        //print first 5 numbers
        print(1);
    }

    static void print(int n){
        if(n<=5) {
            System.out.println(n);
            print(n + 1);
        }

    }
}
