package org.example;

import java.util.HashMap;

public class DynamicFibonacci {
    {
        fibonacciNumbersPool.put(0L, 0L);
        fibonacciNumbersPool.put(1L, 1L);
    }
    private static HashMap<Long, Long> fibonacciNumbersPool = new HashMap<>();

    public static Long calcDynamicFibonacci (Long number) {
        if (fibonacciNumbersPool.containsKey(number)) {
            return fibonacciNumbersPool.get(number);
        }
        if (number <= 1) {
            return number;
        }
        Long fibResult = calcDynamicFibonacci(number - 1) +
                calcDynamicFibonacci(number - 2);
        fibonacciNumbersPool.put(number, fibResult);
        return fibResult;
    }
}
