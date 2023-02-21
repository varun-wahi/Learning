package com.varun.leetcode;
public class reversePalindrome {
    public static void main(String[] args) {
        String reversedStr = " ";
        String originalStr = "racecar";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        if(reversedStr == originalStr){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
