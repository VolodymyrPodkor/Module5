package org.example;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceDynamicProgramming {
    //Spatial complexity - O(n);
    //Temporal complexity - O(n);

    public static List<Integer> fibonacciNumbersResult = new ArrayList<>();

    public static int getFibonacciNumberValueDynamicProgramming(int n){
        fibonacciNumbersResult.add(0);
        fibonacciNumbersResult.add(1);


        if(n <= 0){
            throw new IllegalArgumentException("The number cannot be negative");
        }

        for(int i = 2; i <= n; i++){
         int fibNumber =  fibonacciNumbersResult.get(i - 1) + fibonacciNumbersResult.get(i - 2);
         fibonacciNumbersResult.add(fibNumber);
        }
          return fibonacciNumbersResult.get(n);
    }
}
