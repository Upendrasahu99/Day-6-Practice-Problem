package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A3_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number till we want to check :");
        int number = sc.nextInt();
        int sum = 0;
            for (int i = 2; i < number; i++) {
               if ((number%i)==0)
                   System.out.println(number + "is not prime number");
                }

            }
        }


