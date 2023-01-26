package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A3_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number till we want to check :");
        int lastNumber = sc.nextInt();
        int sum = 0;
        for(int number =2; number<=lastNumber; number++){ // 0 and 1 not take as prime number
         for(int i=2; i<=(number-1); i++){
             if((number%i)==0){
                 System.out.println(number + " is not a prime number");
             }else {
                 System.out.println(number + " is a prime number");
             }
         }
        }

    }
}
