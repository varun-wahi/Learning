package com.varun;

import java.util.Scanner;

public class switchCase {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
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
            case "Grapes" -> {
                System.out.print("Which Type of Grape? \n1.Black\n2.Green\n: ");
                int typeOfGrape = in.nextInt();
                
                switch (typeOfGrape){
                    case 1 -> System.out.println("You chose Black Grapes! That's a great choice!");
                    case 2 -> System.out.println("You chose Green Grapes! That's also a great choice!");
                    default -> System.out.println("Choose an option between 1 and 2 :/");
                }
                System.out.println("It's a small fruit");
            }
            default -> System.out.println("Enter a valid fruit :/");
        }
    }
}
