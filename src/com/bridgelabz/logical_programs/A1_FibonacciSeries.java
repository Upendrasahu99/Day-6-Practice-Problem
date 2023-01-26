//Fibonacci Series

package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class A1_FibonacciSeries {
    public static void main(String[] args) {
        int t1= 0, t2=1;
        for (int a = 0; a <= 10; a++) {
            System.out.print(a + " ");
            int c = t1 = t2;
            t1 = t2;
            t2 = c;
        }
    }
}
