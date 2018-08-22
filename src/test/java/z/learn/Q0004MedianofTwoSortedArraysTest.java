package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * Q0004MedianofTwoSortedArrays Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Aug 22, 2018</pre>
 */
public class Q0004MedianofTwoSortedArraysTest {

    @Before
    public void before() throws Exception {
    }

    /**
     * Method: findMedianSortedArrays(int[] nums1, int[] nums2)
     */
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        assert 2.0d == example.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assert 2.5d == example.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assert 1.5d == example.findMedianSortedArrays(new int[]{1, 2}, new int[]{});
        assert 1.0d == example.findMedianSortedArrays(new int[]{1}, new int[]{});
    }


    private Q0004MedianofTwoSortedArrays example = new Q0004MedianofTwoSortedArrays();
} 
