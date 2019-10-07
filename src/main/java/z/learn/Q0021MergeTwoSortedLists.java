package z.learn;

public class Q0021MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1); // 哨兵
        ListNode current = result;
        ListNode current1 = l1;
        ListNode current2 = l2;
        while (current1 != null || current2 != null) {
            if (current1 != null && current2 != null) {
                int r = Integer.compare(current1.val, current2.val);
                if (r == 0) {
                    current.next = new ListNode(current1.val);
                    current = current.next;
                    current.next = new ListNode(current2.val);
                    current = current.next;
                    current1 = current1.next;
                    current2 = current2.next;
                } else if (r < 0) {
                    current.next = new ListNode(current1.val);
                    current = current.next;
                    current1 = current1.next;
                } else {
                    current.next = new ListNode(current2.val);
                    current = current.next;
                    current2 = current2.next;
                }
            } else {
                if (current1 != null) {
                    current.next = new ListNode(current1.val);
                    current = current.next;
                    current1 = current1.next;
                } else {
                    current.next = new ListNode(current2.val);
                    current = current.next;
                    current2 = current2.next;
                }
            }
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
