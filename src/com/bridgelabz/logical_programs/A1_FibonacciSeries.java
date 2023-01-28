//Fibonacci Series

package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A1_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as long you want to make series : ");
        int n = sc.nextInt();
        int t1= 0, t2=1;
        for (int a = 0; a <= n-1; a++) {
            System.out.print(t1  + " ");
            int c = t1 + t2;
            t1 = t2;
            t2 = c;
        }
    }
}
