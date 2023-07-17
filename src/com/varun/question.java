package com.varun;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        int num = 12345;
        //rotate the number n times
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of times you want to rotate the number:");
        int times = scan.nextInt();
        int output = 0;

        int length = 5;


        for(int j = 0; j<times; j++){ //number of rotations
            int i =0;
            while(num != 0){ // till length
                int rem = num % 10; //find the last digit
                if (i == 0) {
                    output = (int) (output + rem * Math.pow(10, length - i-1)); //10^3 (length-1)
                } else {
                    output = (int) (output + rem * Math.pow(10, i - 1));
                }
                i++;
                num = num/10;
            }
            System.out.println("Final number is: " + output);
            num = output; //Reset values
            output =0;
        }
        }

}
