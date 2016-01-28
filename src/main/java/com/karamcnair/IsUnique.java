package com.karamcnair;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mcnair on 2016-01-27.
 */
public class IsUnique {

    public boolean isUnique(String testString) {
        Set<Character> charSet = new HashSet<>();
        boolean hasDuplicate = false;

        for (int l = 0; (l < testString.length()) && (!hasDuplicate); l++) {
            Character c = testString.charAt(l);
            if (charSet.contains(c)) {
                hasDuplicate = true;
            } else {
                charSet.add(c);
            }
        }
        return !hasDuplicate;
    }
}
