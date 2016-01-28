package com.karamcnair;

/**
 * Created by mcnair on 1/27/16.
 */
public class OneAway
{
    public boolean oneAway(String str1, String str2) {

        // no way they can be one away if they differ in length by > 1.
        if (str1.length() == str2.length()) {
            return changedOne(str1, str2);
        }

        System.out.println("str1 len =  " + str1.length() + ", str2 len = " +  str2.length());

        int lengthGap = str1.length() - str2.length();

        if (Math.abs(lengthGap) > 1) {
            System.out.println("number is " + lengthGap);
            System.out.println("> 1 gap?  " + str1 + ", " +  str2);
            return false;
        } else if (lengthGap > 0) {
            System.out.println("str 1 longer than str2");
            return addOne(str2, str1);
        } else if (lengthGap < 0) {
            System.out.println("str2 longer than str1");
            return addOne(str1, str2);

        }

        // this is a tough one, only the way I've read the answer is the right way.
        // hard to forget.

        System.out.println("oneAway fallthrough on " + str1 + ", " +  str2);
        return false;
    }

    boolean changedOne(String str1, String str2) {
        int miscount = 0;
        for(int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                miscount++;
            }
        }
        System.out.println("changedOne = " + (miscount <= 2));
        return (miscount <= 1);
    }
    boolean addOne(String shorter, String longer) {
        int miscount = 0;
        for(int i = 0; i < longer.length(); i++) {
            if (shorter.charAt(i) != longer.charAt(i)) {
                miscount++;
            }
        }
        System.out.println("changedOne = " + (miscount <= 2));
        return (miscount <= 2);
    }
}
