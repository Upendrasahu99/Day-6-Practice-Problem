//Perfect Number
/*Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number.*/


package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A2_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number till we want to check : ");
        int lastNumber = sc.nextInt();
        for (int number = 1; number < lastNumber; number++)
        {
            int n = 0;
            for (int i = 1; i < number; i++) {
                if ((number % i) == 0) {

                    n += i;
                }
            }
            if (n == number) {
                System.out.println(number + " is a perfect number ");
            }

        }
    }
}
