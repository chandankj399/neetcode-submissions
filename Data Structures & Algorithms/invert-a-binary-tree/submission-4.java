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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode popped = queue.poll();
            TreeNode temp =  popped.left;
            popped.left = popped.right;
            popped.right = temp;
            if (popped.left != null) {
                queue.offer(popped.left);
            }
            if (popped.right != null) {
                queue.offer(popped.right);
            }
        }
        return root;
    }
}
