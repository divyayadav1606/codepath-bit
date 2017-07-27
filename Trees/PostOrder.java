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
    public ArrayList<Integer> postorderTraversal(TreeNode ptr) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (ptr == null)
            return result;

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(ptr);

        while (!st.empty()) {
            TreeNode temp = st.peek();

            if (temp.left == null && temp.right == null) {
                temp = st.pop();
                result.add(temp.val);
            } else {
                if (temp.right != null) {
                    st.push(temp.right);
                    temp.right = null;
                }

                if (temp.left != null) {
                    st.push(temp.left);
                    temp.left = null;
                }
            }
        }
        return result;
    }
}