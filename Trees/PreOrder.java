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
    public ArrayList<Integer> preorderTraversal(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (a == null)
            return result;

        Stack<TreeNode> st = new Stack<TreeNode>();
        result.add(a.val);
        if (a.right != null)
            st.push(a.right);
        if (a.left != null)
            st.push(a.left);

        while (!st.empty()) {
            TreeNode temp = st.pop();
            result.add(temp.val);
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }

        return result;
    }
}
