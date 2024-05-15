package org.example;

public class FibonacciSequenceIteration {
    //Spatial complexity - O(1);
    //Temporal complexity - O(n);

    public static int getFibonacciNumberValue(int n){
       if(n <= 0){
           throw new IllegalArgumentException("The number cannot be negative");
       }

       int prevNumber = 0;
       int currentNumber = 1;
       int result = 0;

        if(n == 1){
            return n;
        }

       for(int i = 2; i <= n; i++){
           result = currentNumber + prevNumber;
           prevNumber = currentNumber;
           currentNumber = result;
       }
       return result;
    }
    }

