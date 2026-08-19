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

    private void post(TreeNode root,List<Integer> ans, Stack<TreeNode> st ) {
        
        if(root!=null) {
            st.push(root);
        }
 while(!st.isEmpty()) {
    TreeNode elen= st.pop();
    int val = elen.val;
    ans.add(val);

 
        if(root.right!=null) {
post(root.right, ans , st);
        }
        if(root.left!=null) {
        post(root.left,ans,st);
        }

    }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
List<Integer> ans = new ArrayList<>();
Stack<TreeNode> st= new Stack<>();

        post(root ,ans, st );
        Collections.reverse(ans);

        return ans;

        
    }
}