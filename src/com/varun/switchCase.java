package com.varun;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of a fruit: ");
        String fruit = in.next();
        //System.out.println(fruit);
        printFruit(fruit);

    }

    static void printFruit(String fruit){
//        switch(fruit){
//            case "Apple":
//                System.out.println("Red Fruit");
//                break;
//            case "Mango":
//                System.out.println("Yellow Sweet fruit!");
//                break;
//
//            case "Grapes":
//                System.out.println("It's a small fruit");
//                break;
//
//            default:
//                System.out.println("Enter a valid fruit :/");
//        }

        switch (fruit) {
            case "Apple" -> System.out.println("Red Fruit");
            case "Mango" -> System.out.println("Yellow Sweet fruit!");
            case "Grapes" -> System.out.println("It's a small fruit");
            default -> System.out.println("Enter a valid fruit :/");
        }
    }
}
