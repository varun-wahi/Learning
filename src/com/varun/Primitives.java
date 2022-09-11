package com.varun;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //STRINGS

        //String is not  a primitive (made of characters)
        System.out.print("Enter Serial Number of Employee: ");
        String serialNo = scanner.next();
        System.out.println("Assigning Employee Code..");
        String predecessor = "00";
        System.out.println("Employee Code: "+ predecessor + serialNo);
        
    }
}
