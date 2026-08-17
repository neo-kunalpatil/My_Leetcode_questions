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

 // preorder using stack .
class Solution {
    public void preorder(TreeNode root , Stack<TreeNode> st,List<Integer> ans) {
        if(root!=null) {
            st.push(root);
        }

        while(!st.isEmpty()) {
            TreeNode r= st.pop();
            ans.add(r.val);

            if(r.right!=null) {
           st.push(r.right);
            }
            if(r.left!=null) {
               st.push(r.left);
                
            }
            

           
        }



    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new Stack<>();
        Stack<TreeNode> st= new Stack<>();

        preorder(root ,st,ans);
        return ans;


        
    }
}