package org.example;

public class FibonacciSequenceRecursive {
    //Spatial complexity - O(n);
    //Temporal complexity - O(2^n);

    public static int getFibonacciNumberValueRecursive(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The number cannot be negative");
        }

        if (n == 1 || n == 2) {
            return 1;
        }
            return getFibonacciNumberValueRecursive(n - 1) + getFibonacciNumberValueRecursive(n - 2);

    }
}

