class Solution {

    private Integer prev = null;

    public boolean isValidBST(TreeNode root) {
        return inOrderTraversal(root);
    }

    private boolean inOrderTraversal(TreeNode node) {
        if (node == null) {
            return true;
        }

        // Check the left subtree
        if (!inOrderTraversal(node.left)) {
            return false;
        }

        // Check current node value with the previous node value
        if (prev != null && node.val <= prev) {
            return false;
        }
        prev = node.val;

        // Check the right subtree
        return inOrderTraversal(node.right);
    }
}
