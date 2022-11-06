package com.varun;

public class Recursion {
    public static void main(String[] args) {
        //WAP that takes a number and prints it
        //print first 5 numbers
        print(1);
    }

    static void print(int n){
        if(n<=5) { //Base Condition: A condition that stops recursion.
            //If base condition as not put, there will be a point where the machine will run out of memory.
            //This condition is called *Stack Overflow*
            System.out.println(n);
            print(n + 1); //Recursive call
        }

    }
}
