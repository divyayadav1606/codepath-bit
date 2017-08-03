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
    public TreeNode buildTree(List<Integer> a) {
        if (a == null || a.size() == 0)
            return null;

        int maxIndex = a.indexOf(Collections.max(a));

        TreeNode n = new TreeNode(a.get(maxIndex));
        n.left = buildTree(a.subList(0, maxIndex));
        n.right = buildTree(a.subList(maxIndex + 1, a.size()));

        return n;

    }

    public TreeNode buildTree(ArrayList<Integer> a) {
        return buildTree(a.subList(0, a.size()));
    }
}