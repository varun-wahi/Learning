package com.varun;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //syntax
        //datatype[] name = new datatype[size];
        Scanner input = new Scanner(System.in);
        //store 5 roll numbers
        int[] rnos = new int[5];

        //or directly
//        int[] rollNumbers = {1,2,3,4,5};

        for (int i = 0; i < rnos.length; i++) {
            rnos[i] = input.nextInt();
        }

        for(int num : rnos){    //Shortcut for foreach loop
            System.out.println(num);
        }
        //System.out.println(java.util.Arrays.toString(rnos));
    }
}
