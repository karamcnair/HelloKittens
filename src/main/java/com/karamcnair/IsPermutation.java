package com.karamcnair;


/**
 * Created by mcnair on 2016-01-27.
 */
class IsPermutation {

    public boolean isPermutation(String stringA, String stringB) {

        // return value - assume not
        // simple tests - if different lengths, nope.
        if (stringA.length() != stringB.length()) {
            System.out.println("quick exit");
            return false;
        }

        // one way is to sort 'em and then compare 'em
        char c[] = stringA.toCharArray();
        java.util.Arrays.sort(c);
        String sortedA = new String(c);
        c = stringB.toCharArray();
        java.util.Arrays.sort(c);
        String sortedB = new String(c);

        System.out.println(sortedA);
        System.out.println(sortedB);

        return sortedA.equals(sortedB);

    }

}
