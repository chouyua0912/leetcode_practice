package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * Q0021MergeTwoSortedLists Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Oct 7, 2019</pre>
 */
public class Q0021MergeTwoSortedListsTest {

    @Before
    public void before() throws Exception {
    }

    @Test
    public void testMergeTwoLists() throws Exception {
        Q0021MergeTwoSortedLists.ListNode l1 = new Q0021MergeTwoSortedLists.ListNode(1);
        l1.next = new Q0021MergeTwoSortedLists.ListNode(2);
        l1.next.next = new Q0021MergeTwoSortedLists.ListNode(4);

        Q0021MergeTwoSortedLists.ListNode l2 = new Q0021MergeTwoSortedLists.ListNode(1);
        l2.next = new Q0021MergeTwoSortedLists.ListNode(3);
        l2.next.next = new Q0021MergeTwoSortedLists.ListNode(4);

        Q0021MergeTwoSortedLists.ListNode l3 = example.mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.print(l3.val + "->");
            l3 = l3.next;
        }
    }

    private Q0021MergeTwoSortedLists example = new Q0021MergeTwoSortedLists();
} 
