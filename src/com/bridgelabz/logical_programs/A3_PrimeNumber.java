package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A3_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number till we want to check :");
        int number = sc.nextInt();

        for (int i = 2; i <= number; i++) {
            int sum = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    sum++;
                }
                }if (sum == 0) {
                System.out.println(i + " is prime number ");
            }
        }
    }
}


