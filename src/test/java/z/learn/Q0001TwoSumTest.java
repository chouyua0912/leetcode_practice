package z.learn;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Q0001TwoSum Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Aug 11, 2018</pre>
 */
public class Q0001TwoSumTest {

    @Before
    public void before() throws Exception {
    }

    /**
     * Method: twoSum(int[] nums, int target)
     */
    @Test
    public void testTwoSum1() throws Exception {
        int[] result = example.twoSum1(new int[]{2, 7, 11, 15}, 9);
        assertResult(result);
    }

    @Test
    public void testTwoSum2() throws Exception {
        int[] result = example.twoSum2(new int[]{2, 7, 11, 15}, 9);
        assertResult(result);

        int[] result2 = example.twoSum2(new int[]{3, 3}, 6);
        assertResult(result2);
    }

    @Test
    public void testTwoSum3() throws Exception {
        int[] result = example.twoSum3(new int[]{2, 7, 11, 15}, 9);
        assertResult(result);

        int[] result2 = example.twoSum3(new int[]{3, 3}, 6);
        assertResult(result2);
    }

    private void assertResult(int[] result) {
        assert result[0] == 0;
        assert result[1] == 1;
    }


    private Q0001TwoSum example = new Q0001TwoSum();
} 
