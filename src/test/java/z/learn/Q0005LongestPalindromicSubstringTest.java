package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * Q0005LongestPalindromicSubstring Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Aug 24, 2018</pre>
 */
public class Q0005LongestPalindromicSubstringTest {

    @Before
    public void before() throws Exception {
    }

    /**
     * Method: longestPalindrome(String s)
     */
    @Test
    public void testLongestPalindrome() throws Exception {
        assert "abccba".equals(example.longestPalindrome("abccbabb"));
        assert "bab".equals(example.longestPalindrome("babad"));
        assert "bb".equals(example.longestPalindrome("cbbd"));
        assert "a".equals(example.longestPalindrome("ac"));
        assert "".equals(example.longestPalindrome(""));
    }

    private Q0005LongestPalindromicSubstring example = new Q0005LongestPalindromicSubstring();
} 
