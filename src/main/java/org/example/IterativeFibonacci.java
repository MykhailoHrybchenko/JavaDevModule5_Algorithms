package org.example;

public class IterativeFibonacci {

    public static long calcIterativeFibonacci (int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        long firstDigit = 0;
        long secondDigit = 1;
        long result = 0;
        for (int i = 2; i <= number ; i++) {
            result = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = result;
        }
        return result;
    }
}
