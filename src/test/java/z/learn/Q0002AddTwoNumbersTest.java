package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * Q0002AddTwoNumbers Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Aug 19, 2018</pre>
 */
public class Q0002AddTwoNumbersTest {

    @Before
    public void before() throws Exception {
        Q0002AddTwoNumbers.ListNode l1_1 = new Q0002AddTwoNumbers.ListNode(3);
        Q0002AddTwoNumbers.ListNode l1_2 = new Q0002AddTwoNumbers.ListNode(4);

        l1Head = new Q0002AddTwoNumbers.ListNode(2);
        l1_2.next = l1_1;
        l1Head.next = l1_2;

        Q0002AddTwoNumbers.ListNode l2_1 = new Q0002AddTwoNumbers.ListNode(4);
        Q0002AddTwoNumbers.ListNode l2_2 = new Q0002AddTwoNumbers.ListNode(6);

        l2Head = new Q0002AddTwoNumbers.ListNode(5);
        l2_2.next = l2_1;
        l2Head.next = l2_2;
    }

    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    @Test
    public void testAddTwoNumbersForL1L2() throws Exception {
        Q0002AddTwoNumbers.ListNode node = example.addTwoNumbers(l1Head, l2Head);
        System.out.println(node);
    }

    private Q0002AddTwoNumbers.ListNode l1Head;
    private Q0002AddTwoNumbers.ListNode l2Head;

    private Q0002AddTwoNumbers example = new Q0002AddTwoNumbers();
} 
