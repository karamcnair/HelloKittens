package com.karamcnair;

import com.karamcnair.*;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by mcnair on 2016-01-27.
 */
@SuppressWarnings("ALL")
public class HelloKittensTest {
    @Test
    public void testMerge() throws Exception {
        HelloKittens kit = new HelloKittens();
        String[] stringArr1 = {"this", "is", "a", "static"};
        String[] stringArr2 = {"array", "this", "is"};

        String[] expected = {"this", "is", "a", "static", "array", "this", "is"};
        String[] actual = kit.merge(stringArr1, stringArr2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIsPermutation() throws Exception {
        String str1 = "astral";
        String str1perm = "larsta";
        String str2 = "what.ever!";
        IsPermutation p = new IsPermutation();

        Assert.assertTrue(p.isPermutation(str1, str1perm));
        Assert.assertFalse(p.isPermutation(str1, str2));

    }

    @Test
    public void testIsUnique() throws Exception {
        String notUnique = "laaaaaa";
        String unique = "absciehlwj";
        IsUnique u = new IsUnique();

        Assert.assertTrue(u.isUnique(unique));
        Assert.assertFalse(u.isUnique(notUnique));

    }

    @Test
    public void testURLify() throws Exception {
        String input = "Ms Dana Scully    ";
        String expected = "Ms%20Dana%20Scully";

        URLify u = new URLify();
        String actual = u.urlify(input);
        Assert.assertEquals(expected, actual);
//        Assert.assertTrue(output.equals(u.urlify(input)));

    }

    @Test
    public void testIsPalindromePermutation() throws Exception {
        String isPalindromePerm = "Tact Coa";
        String notPalindromePerm = "abstract";

        IsPalindromePermutation ip = new IsPalindromePermutation();

        Assert.assertTrue(ip.isPalindromePermutation(isPalindromePerm));
        Assert.assertFalse(ip.isPalindromePermutation(notPalindromePerm));
    }

    @Test
    public void testOneAway() throws Exception
    {

        String s1 = "pale";
        String s2 = "ple";
        String s3 = "pales";
        String s4 = "bale";
        String s5 = "bake";

        OneAway oa = new OneAway();
        Assert.assertTrue(oa.oneAway(s1, s2));
        Assert.assertTrue(oa.oneAway(s1, s3));
        Assert.assertTrue(oa.oneAway(s1, s4));
        Assert.assertFalse(oa.oneAway(s1, s5));

    }

    @Test
    public void testStringCompression() throws Exception
    {
        String s1 = "aabcccccaaa";
        String s1Result = "a2b1c5a3";
        String s2 = "abcdefg";
        String s2Result = "abcdefg";

        StringCompression sc = new StringCompression();
        Assert.assertEquals(sc.compressString(s1), s1Result);
        Assert.assertEquals(sc.compressString(s2), s2Result);

    }


    @Test
    public void testRotateMatrix() throws Exception
    {


    }
}
