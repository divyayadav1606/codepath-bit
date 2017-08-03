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
    private TreeNode sortedArrayToBST(final List<Integer> a, int start, int end) {
        if (a == null)
            return null;

        if (start > end)
            return null;

        int mid = (start + end)/2;

        TreeNode n = new TreeNode(a.get(mid));
        n.left = sortedArrayToBST(a, start, mid -1);
        n.right = sortedArrayToBST(a, mid + 1, end);

        return n;
    }
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        return sortedArrayToBST(a, 0, a.size()-1);
    }
}
