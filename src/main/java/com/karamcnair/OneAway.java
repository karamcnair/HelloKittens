package com.karamcnair;

/**
 * Created by mcnair on 1/27/16.
 */
class OneAway
{
    public boolean oneAway(String str1, String str2) {

        // Sadly, I had read the answer for this one & it's clever - hard to forget.
        // So implementing from memory.

        int lengthGap = str1.length() - str2.length();

        // no way they can be one away if they differ in length by > 1
        if (Math.abs(lengthGap) > 1) {
            return false;
        } else if (lengthGap == 0){
            return changedOne(str1, str2);
        }
        else if (lengthGap > 0) {
            System.out.println("str 1 longer than str2");
            return addOne(str2, str1);
        } else if (lengthGap < 0) {
            System.out.println("str2 longer than str1");
            return addOne(str1, str2);

        }

        return false;
    }

    private boolean changedOne(String str1, String str2) {
        int mismatch = 0;
        for(int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                mismatch++;
            }
        }
        return (mismatch <= 1);
    }
    private boolean addOne(String shorter, String longer) {

        // yeah, this wasn't done - this was an interrupted C&P from changedOne. :) Thanks, JUnit!
        // TruthCondition is: every character in shorter must be in longer IN ORDER except for one character
        // in longer which could be anyway.

        // at the first mismatched character, we add to the miscount & bump the longer index along by 1.
        // if we hit another, it's a fail.
        int mismatch = 0;
        for(int i = 0, j = 0; i < shorter.length() && j < longer.length(); i++, j++) {

            // I'm not a HUGE fan of modifying a loop variable.
            // I suppose another way to do it would be to slice the mismatched character
            // out of longer and continue using just i. Less chance of diverging on indicies.
            if (shorter.charAt(i) != longer.charAt(j)) {
                mismatch++;
                j++;
            }
        }
        return (mismatch <= 1);
    }
}
