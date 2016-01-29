package com.karamcnair;

/**
 * Created by mcnair on 1/27/16.
 */
@SuppressWarnings("DefaultFileTemplate")
class StringCompression
{
    public String compressString(String theString) {
        // naive solution is to walk through the string & each time there's a dup, count up
        // when the char changes, write to StringBuilder.

        char curChar = ' ';
        int curCharCount = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < theString.length(); i++) {
            char c = theString.charAt(i);

            if (c == curChar) {
                curCharCount++;
            }
            else {
                // if this isn't the very first time through the loop
                if (curCharCount > 0 ) {
                    sb.append(curChar).append(curCharCount);
                }
                curChar = c;
                curCharCount = 1;
            }
        }
        /// flush the last one
        sb.append(curChar).append(curCharCount);


        if (sb.length() >= theString.length()) {
            return theString;
        } else {
            return sb.toString();
        }
    }
}
