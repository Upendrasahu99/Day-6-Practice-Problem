//Reverse a number

package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A4_ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number want to reverse = ");
        int n = sc.nextInt();
        int r;
        while (n>0){
            r=n%10;
            n=n/10;
            System.out.print(r);
        }

    }

}
