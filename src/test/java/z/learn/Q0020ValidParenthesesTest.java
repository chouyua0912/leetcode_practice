package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * Q0020ValidParentheses Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Oct 7, 2019</pre>
 */
public class Q0020ValidParenthesesTest {

    @Before
    public void before() throws Exception {
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
        assert Q0020ValidParentheses.isValid("()");
        assert Q0020ValidParentheses.isValid("()[]{}");
        assert !Q0020ValidParentheses.isValid("(]");
        assert !Q0020ValidParentheses.isValid("([)]");
        assert Q0020ValidParentheses.isValid("{[]}");
        assert !Q0020ValidParentheses.isValid("[");
        assert !Q0020ValidParentheses.isValid("]");
        System.out.println("finished");
    }
}
