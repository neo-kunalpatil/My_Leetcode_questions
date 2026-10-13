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

    int level(TreeNode root) {
        if(root==null) {
            return 0;
        }

        int left = level(root.left);
        int right= level(root.right);


        return 1+ Math.max(left, right);
    }

    List<Integer> zig(TreeNode root ,int n , int level ,List<Integer> ans) {
        if(root==null) {
            return ans;
        }

        if(n==level) {
            ans.add(root.val);
            return ans;
        }


        if(root.left!=null) {
            zig(root.left, n, level+1, ans);
        }
        if(root.right!=null) {
            zig(root.right, n, level+1, ans);
        }


        return ans;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        


        for(int x=0;x<level(root);x++) {
            int n=x;
            List<Integer> ans= new ArrayList<>();
            zig(root, n, 0, ans);
            res.add(ans);


        }

        return res;
        
    }
}