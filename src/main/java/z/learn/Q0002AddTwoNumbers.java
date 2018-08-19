package z.learn;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 遍历链表On复杂度
 */
public class Q0002AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int add) {
        ListNode resultNode = null;
        int sum = 0;
        if (l1 == null && l2 == null) {
            if (add < 1)
                return null;
            else
                return new ListNode(add);
        } else if (l1 != null && l2 == null) {
            sum = l1.val + add;
            resultNode = new ListNode(sum % 10);
            resultNode.next = addTwoNumbers(l1.next, null, sum / 10);
        } else if (l1 == null && l2 != null) {
            sum = l2.val + add;
            resultNode = new ListNode(sum % 10);
            resultNode.next = addTwoNumbers(null, l2.next, sum / 10);
        } else {
            sum = l1.val + l2.val + add;
            resultNode = new ListNode(sum % 10);
            resultNode.next = addTwoNumbers(l1.next, l2.next, sum / 10);
        }

        return resultNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
