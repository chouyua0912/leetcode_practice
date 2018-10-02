package z.learn;

/**
 * 非递归解法？
 */
public class Q0101SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode ll, TreeNode rr) {
        if (ll != null && rr != null) {
            if (ll.val != rr.val) {
                return false;
            } else {
                return isSymmetric(ll.left, rr.right) && isSymmetric(ll.right, rr.left);
            }
        } else
            return ll == null && rr == null;
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
