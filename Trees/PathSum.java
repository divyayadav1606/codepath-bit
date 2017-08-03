/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int hasPathSum(TreeNode a, int b) {
        if (a == null)
            return 0;

        if (a.left == null && a.right == null & (b - a.val) == 0)
            return 1;

        return hasPathSum(a.left, b - a.val) | hasPathSum(a.right, b - a.val);
    }
}
