package com.karamcnair;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

/**
 * Created by mcnair on 2016-01-27.
 */
@SuppressWarnings("DefaultFileTemplate")
class IsPalindromePermutation {

    public boolean isPalindromePermutation(String testString) {

        // either there's an even number of every character in the string OR
        // even for all except one.
        testString = testString.toLowerCase().replaceAll("\\s+","");

        boolean isOdd = (testString.length() % 2 == 1);

        Map<Character, Integer> charCount = new HashMap<>();

        // go through the string & count each char.
        for (int i = 0; i < testString.length(); i++) {
            Integer count = charCount.get(testString.charAt(i));

            if (count == null) {
                charCount.put(testString.charAt(i), 1);
            }
            else {
                charCount.put(testString.charAt(i), count + 1);
            }
        }

        System.out.println(charCount);

        // now check the rules -- find count of odd chars

        List<Integer> oddballs = charCount.values()
                                .stream()
                                .filter(entry -> (entry % 2 == 1))
                                .collect(Collectors.toList());
        System.out.println("This is " + (isOdd ? "" : "NOT ") + "odd!");
        System.out.println(oddballs);

        return ((oddballs.size() == 0) || (oddballs.size() == 1 && isOdd));
    }
}
