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

    public void height(TreeNode root , String s , List<String> ans) {

        if(root==null) {
            return;
        }

        if(root.left ==null && root.right==null) {
            s+=root.val;
            ans.add(s);
            return;
        }


        height(root.left , s+root.val+"->", ans);
        height(root.right, s+root.val+"->",ans);
    }

    public List<String> binaryTreePaths(TreeNode root) {
       List<String> ans= new ArrayList<>();
       height(root , "", ans);
       
       return ans;
        
    }
}