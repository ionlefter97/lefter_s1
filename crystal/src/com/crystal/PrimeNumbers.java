package com.crystal;

import java.util.Vector;

public class PrimeNumbers {
    public Vector getPrimeNumbers(int limit){

        Vector vector = new Vector();
        for (int number = 1; number <= limit; number++){
            int count = 0;
            for(int i = 1; i <= number; i++){
                if (number % i == 0){
                    count++;
                }
            }
            if(count == 2){
                vector.addElement(number);
            }
        }
        return vector;
    }
}
