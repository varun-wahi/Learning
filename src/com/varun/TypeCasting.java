package com.varun;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = 0;
        System.out.println(num);

        //What if we want to convert float to integer?
        //type casting
        int number = (int)(67.87f);
        System.out.println(number);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //max a byte can be is 256
                            //it is doing 257 % 256 = 1
        System.out.println(b); // outputs 1

        System.out.print("Enter Temperature in Celcius: ");
        float Far = Cel2Far(scanner.nextFloat());
        System.out.println("Temperature in Farhaneit is: " + Far);
    }

    private static float Cel2Far(float Cel){
        return (Cel * 9/5) + 32;
    }

}
