package com.crystal;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class VampireNumbers {
    public Vector getVampireNumbers() {
        Vector vectorOfVampireNumbers = new Vector();

        for (int number = 1000; number < 120000; number++) {
            String theNumber = String.valueOf(number);
            int lengthOfNumber = theNumber.length();

            //The number of digits must be even
            if (lengthOfNumber % 2 == 0) {

                Set set = getPermutation(theNumber);
                for (Object getNumber : set) {
                    String string = (String) getNumber;
                    int number1 = Integer.parseInt(string.substring(0, lengthOfNumber / 2));
                    int number2 = Integer.parseInt(string.substring(lengthOfNumber / 2));
                    if (number1 * number2 == number) {
                        if (!(number1 % 10 == 0 && number2 % 10 == 0)) {
                            vectorOfVampireNumbers.addElement(number);
                        }
                    }
                }
            }
        }
        return vectorOfVampireNumbers;
    }


    private static Set<String> getPermutation(String str) {
        // create a set to avoid duplicate permutation
        Set<String> permutations = new HashSet<String>();
        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            // terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        // get the first character
        char first = str.charAt(0);

        // get the remaining substring
        String sub = str.substring(1);

        // make recursive call to getPermutation()
        Set<String> words = getPermutation(sub);

        // access each element from words
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

}
