public class Solution {
    public boolean isBalanced(TreeNode root) {
        // there are no nodes, this counts as balanced
        if (root == null) {
            return true;
        }

        // use the absolute value
        // if the difference between heights is greater than 1
        // the tree is NOT balanced
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    // helper method
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // returns the maximum of the two arguments
        // + 1 for root
        return 1 + Math.max(height(node.left), height(node.right));
    }
}

