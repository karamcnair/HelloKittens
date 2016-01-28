package com.karamcnair;

/**
 * Created by mcnair on 2016-01-27.
 */
public class URLify {

    public String urlify(String unencodedString) {
        String encodedString = "";

        // naive solution - not as requested but testing the test case.
        // unencodedString = unencodedString.trim();
        // encodedString = unencodedString.replace(" ", "%20");


        char[] chars = unencodedString.toCharArray();
        // from the last character in the array walk backwards until you find
        // a non-space character. Copy that into the last slot & update 'last'
        // index by -1.
        // when you find a SPACE, copy "%20" into last -2, last -1, last
        // and update last to last -3
        // (clearly this is assuming perfect information is is hella brittle
        int currentIndex = chars.length - 1;
        int lastIndex = currentIndex;

        while ((chars[currentIndex] == ' ') && (currentIndex > - 1)) {
            // we've been promised enough space at the end, so we don't want
            // to escape the end of the string - skip past those.
            currentIndex--;
        }

        // now we have a real character to work with
        // IRL I'd add things to make sure we don't go off the end of the array.
        while (currentIndex > -1) {
            if (chars[currentIndex] != ' ') {
                chars[lastIndex] = chars[currentIndex];
                lastIndex--;
            }
            else {
                // we have a space to escape & we SHOULD have freed up the next 3 slots
                chars[lastIndex - 2] = '%';
                chars[lastIndex - 1] = '2';
                chars[lastIndex] = '0';
                lastIndex -=3;
            }
            currentIndex--;
            System.out.println(chars);
        }
        String returnVal = new String(chars);
        return returnVal;
    }
}
