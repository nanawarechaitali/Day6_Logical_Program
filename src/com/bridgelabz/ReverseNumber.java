package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num =0;
        int reversenum = 0;
        System.out.println("Enter the given number; ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        while(num != 0){
            int remainder = num%10;
            reversenum = reversenum*10+remainder;
            num = num/10;
        }
        System.out.println("The reverse of given number is" +reversenum);

    }
}
