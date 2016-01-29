package com.karamcnair;

import java.util.StringJoiner;
import java.util.stream.Collector;

/**
 * Created by mcnair on 1/27/16.
 */
@SuppressWarnings("DefaultFileTemplate")
class StringCompression
{
    public String compressString(String theString) {
        // Now going to implement the suggested improvement that saves space. I've
        // read the idea but will be implementing on my own.

        // high level: first run through the string to figure out what the length of
        // the compressed string will be and then only do that if it's going to be shorter than
        // the original string. Helper function to do the first.
        int compressedLen = countCompressedString(theString);

        // OK, I found the lookahead different enough from my original that I ended up looking
        // more than I planned. HOWEVER, let's see if we can extend it to use lambda function.
        // Definitely could in some languages, but we'll see with Java.

        // ok, so I'm going to be using either reduce or collect.

        // I'll be passing the string in (or an array of chars? let's try that for simplicity, since
        // a String probably isn't a true 'collection')

        // if 'next' is null, OR 'this' and 'next' differ,
        // the interim accumulator get accumulated onto the global accumulator.
        // If not, ('this' and 'next' are the same), the interim accumulator goes up.


//        theString.chars().range(1,4).forEach(System.out::println);

//
//
//        java.util.stream.Collector<Integer, java.util.StringJoiner, String > charCollector =
//                Collector.of(
//                        () -> new StringJoiner(" "),
//                        (j, p) -> j.add(p)),
//                        j1, j2) -> j1.merge(j2), StringJoiner::toString);
//
//        String newString = theString.chars().collect(charCollector);



        if (compressedLen > theString.length()) {
            return theString;
        }

        StringBuilder sb = new StringBuilder(compressedLen);
        int countConsecutive = 0;

        for (int i = 0; i < theString.length(); i ++ ) {
            // first one
            countConsecutive++;
            // if the current character doesn't match the next one, we need to add to the length
            if ((i + 1 == theString.length() || (theString.charAt(i)) != theString.charAt(i+1))) {
                sb.append(theString.charAt(i)).append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return sb.toString();
    }

    public int countCompressedString(String theString) {
        int len = 0;
        int countConsecutive = 0;

        // because we're doing lookahead, we have to stop one loop index early
        for (int i = 0; i < theString.length(); i ++ ) {
            // first one
            countConsecutive++;
            // if the current character doesn't match the next one, we need to add to the length
            if ((i + 1 == theString.length()) || (theString.charAt(i) != theString.charAt(i+1))) {
                len += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return len;
    }


}
