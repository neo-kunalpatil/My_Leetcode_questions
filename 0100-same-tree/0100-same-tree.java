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

    public void preorder(TreeNode root, List<Integer> ans) {
        if(root==null) {
            ans.add(null);
            return;
        }
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);


        System.out.println(ans);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> ans = new ArrayList<>();

        List<Integer> ans2 = new ArrayList<>();

        preorder(p , ans);
        preorder(q, ans2);
        

        return ans.equals(ans2);
        
    }
}