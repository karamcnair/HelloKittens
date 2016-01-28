import com.karamcnair.*;
import org.junit.Test;
import org.junit.Assert;

import sun.jvm.hotspot.HelloWorld;

/**
 * Created by mcnair on 2016-01-27.
 */
public class HelloKittensTest {
    @org.junit.Test
    public void testMerge() throws Exception {
        HelloKittens kit = new HelloKittens();
        String[] stringArr1 = {"this", "is", "a", "static"};
        String[] stringArr2 = {"array", "this", "is"};

        String[] expected = {"this", "is", "a", "static", "array", "this", "is"};
        String[] actual = kit.merge(stringArr1, stringArr2);
        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.Test
    public void testIsPermutation() throws Exception {
        String str1 = "astral";
        String str1perm = "larsta";
        String str2 = "what.ever!";
        IsPermutation p = new IsPermutation();

        Assert.assertTrue(p.isPermutation(str1, str1perm));
        Assert.assertFalse(p.isPermutation(str1, str2));

    }

    @org.junit.Test
    public void testIsUnique() throws Exception {
        String notUnique = "laaaaaa";
        String unique = "absciehlwj";
        IsUnique u = new IsUnique();

        Assert.assertTrue(u.isUnique(unique));
        Assert.assertFalse(u.isUnique(notUnique));

    }

    @org.junit.Test
    public void testURLify() throws Exception {
        String input = "Ms Dana Scully    ";
        String expected = new String("Ms%20Dana%20Scully");

        URLify u = new URLify();
        String actual = u.urlify(input);
        Assert.assertEquals(expected, actual);
//        Assert.assertTrue(output.equals(u.urlify(input)));

    }

    @org.junit.Test
    public void testIsPalindromePermutation() throws Exception {
        String isPalindromePerm = "Tact Coa";
        String notPalindromePerm = "abstract";

        IsPalindromePermutation ip = new IsPalindromePermutation();

        Assert.assertTrue(ip.isPalindromePermutation(isPalindromePerm));
        Assert.assertFalse(ip.isPalindromePermutation(notPalindromePerm));
    }
}
