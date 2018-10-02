package z.learn;

import java.util.ArrayList;
import java.util.List;

public class Q0102BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            list.add(new ArrayList<>());
            levelOrder(0, root, list);
        }
        return list;
    }

    private void levelOrder(int level, TreeNode node, List<List<Integer>> list) {
        list.get(level).add(node.val);
        if (node.left != null || node.right != null) {
            if (list.size() <= (level + 1)) {
                list.add(new ArrayList<>());
            }
            if (node.left != null)
                levelOrder(level + 1, node.left, list);
            if (node.right != null)
                levelOrder(level + 1, node.right, list);
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
