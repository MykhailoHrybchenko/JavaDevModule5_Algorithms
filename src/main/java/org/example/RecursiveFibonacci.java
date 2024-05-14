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
/*
Просторова складність О(n) оскільки викликається n разів
Часова О(2^n) оскільки кількість рекурсивних викликів подвоюється з кожним кроком
 */
