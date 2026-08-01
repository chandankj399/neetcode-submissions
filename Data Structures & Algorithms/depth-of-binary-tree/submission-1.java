/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int currentDepth) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left, currentDepth);
        int rightDepth = maxDepth(root.right, currentDepth);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
