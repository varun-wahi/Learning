package com.varun;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        //Given: 3 poles A,B,C. (Source, Helper, Destination)
        //You can pick only 1 plate at a time
        //No larger plate can be placed on top of a smaller plate
        //Output should be the steps
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = in.nextInt();
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.towerOfHanoi(n, "Source", "Destination", "Helper");
    }

    void towerOfHanoi(int n, String src, String dest, String helper){
        if(n<=0){
            return;
        }
        else{
            towerOfHanoi(n-1, src , helper, dest);
            System.out.println("Disk " +n+" moved from "+src+ " to "+dest);
            towerOfHanoi(n-1, helper, dest, src);



        }
    }
}
