package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * Q0003LongestSubstringWithoutRepeatingCharacters Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Aug 21, 2018</pre>
 */
public class Q0003LongestSubstringWithoutRepeatingCharactersTest {

    @Before
    public void before() throws Exception {
    }

    /**
     * Method: lengthOfLongestSubstring(String s)
     */
    @Test
    public void testLengthOfLongestSubstring1() throws Exception {
        assert 3 == example.lengthOfLongestSubstring("abcabcbb");
    }

    @Test
    public void testLengthOfLongestSubstring2() throws Exception {
        assert 1 == example.lengthOfLongestSubstring("bbbbb");
    }

    @Test
    public void testLengthOfLongestSubstring3() throws Exception {
        assert 3 == example.lengthOfLongestSubstring("pwwkew");
    }

    @Test
    public void testLengthOfLongestSubstring4() throws Exception {
        assert 3 == example.lengthOfLongestSubstring("dvdf");
    }

    private Q0003LongestSubstringWithoutRepeatingCharacters example = new Q0003LongestSubstringWithoutRepeatingCharacters();
} 
