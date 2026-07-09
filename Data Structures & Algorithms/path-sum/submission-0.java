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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> valStack = new Stack<>();
        valStack.push(root.val);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int currentSum = valStack.pop();
            if (node.left == null && node.right == null) {
                if (currentSum == targetSum) return true;
            }
            if (node.left != null) {
                stack.push(node.left);
                valStack.push(currentSum + node.left.val);
            }
            if (node.right != null) {
                stack.push(node.right);
                valStack.push(currentSum + node.right.val);
            }
        }
        return false;
    }
}