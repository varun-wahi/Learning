package com.varun;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {0, 4, 5, 7},
                {2, 4, 1, 2},
                {3, 4, 6, 3}};


        for(int[]elem: arr){
            for(int i: elem){
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }
}
