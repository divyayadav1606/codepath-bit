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
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode ptr = a;

        if(a == null)
            return result;

        Stack<TreeNode> st = new Stack<TreeNode>();

        while (ptr != null || !st.empty()) {
            if (ptr != null) {
                st.push(ptr);
                ptr = ptr.left;
            } else {
                TreeNode temp = st.pop();
                result.add(temp.val);
                ptr = temp.right;
            }
        }

        return result;
    }
}
