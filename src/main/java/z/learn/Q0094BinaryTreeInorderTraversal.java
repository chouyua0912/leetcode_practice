package z.learn;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 如何用非递归实现？
 */
public class Q0094BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node != null) {
            inorderTraversal(node.left, list);
            list.add(node.val);
            inorderTraversal(node.right, list);
        }
    }

    private void inorderTraversalLoop(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        TreeNode peek;
        while ((peek = stack.peek()) != null) {
            if (peek.right != null) {
                stack.push(peek.right);
            }
            if (peek.left != null) {

            }
            if (peek.left == null && peek.right == null) {
                TreeNode e = stack.pop();
                list.add(e.val);
            }

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
