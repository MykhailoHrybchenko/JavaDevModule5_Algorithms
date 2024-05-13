package org.example;

public class RecursiveFibonacci {

    public static long calcRecursiveFibonacci (int number) {
       if (number <= 1) {
           return number;
       }
        return calcRecursiveFibonacci(number - 1)
                + calcRecursiveFibonacci(number - 2);
    }
}
