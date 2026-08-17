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

    private static int levels(TreeNode root) {
        if(root == null) {
            return 0;
        }
int left = levels(root.left);
int right= levels(root.right);
        return 1+ Math.max(left ,right);
    }
    private static List<Integer> level(TreeNode root,int n, int level,List<Integer> ans ) {
        if(root== null) {
            return ans;
        }

        if(level==n) {
            ans.add(root.val);
            return ans;
        }

        level(root.left,n,level+1,ans);
        level(root.right,n,level+1,ans);

      return ans;






    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
  
        for(int x=0; x<levels(root);x++) {
            int n=x;
            
            level(root,n,0,ans= new ArrayList<>());
            res.add(ans);
        }

        return res;


        
    }
}