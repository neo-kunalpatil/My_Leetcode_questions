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
    private int level(TreeNode root) {
        if(root==null) {
            return 0;
        }

        int left= level(root.left);
     int right= level(root.right);

        return 1+ Math.max(left, right);
    }

    public List<Integer> zigzag(TreeNode root , int n, int level, List<Integer> ans) {
        if(root==null) {
            return ans;
        }
        if(level==n) {
            ans.add(root.val);
            return ans;
        }
      if(n%2==0)  {
           if(root.left!=null) {zigzag(root.left , n, level+1,ans); }
          if(root.right!=null) {zigzag(root.right,n,level+1,ans); }

        
      }
      else  {
       if(root.right!=null) {zigzag(root.right,n,level+1,ans); }
        if(root.left!=null) {zigzag(root.left , n, level+1,ans); }
       

      }

        return ans;






    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        

        for(int x=0;x<level(root);x++) {
            List<Integer> ans= new ArrayList<>();
            int n=x;
            zigzag(root,n,0,ans);
            res.add(ans);


        }

        return res;
        
    }
}






// i want to use depth first search here .using nth order.