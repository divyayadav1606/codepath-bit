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
    public int isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return 1;
        else if (a == null || b == null)
            return 0;

        if (a.val == b.val)
            return (isSameTree(a.left, b.left) == 1 &&
                    isSameTree(a.right, b.right) == 1 ? 1 : 0);
        else
            return 0;
    }
}
