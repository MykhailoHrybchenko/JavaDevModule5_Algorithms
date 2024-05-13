package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(IterativeFibonacci.calcIterativeFibonacci(8));
        System.out.println(RecursiveFibonacci.calcRecursiveFibonacci(8));
        System.out.println(DynamicFibonacci.calcDynamicFibonacci(5L));
    }
}