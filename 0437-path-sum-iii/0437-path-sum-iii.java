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
    public  int count(TreeNode root , long TargetSum) {
        int count=0;
        if(root==null) {
            return 0;
        }
        if(root.val==TargetSum) {
            count++;
        }

        count+=count(root.left , TargetSum-root.val);
        count+=count(root.right, TargetSum- root.val);


        return count ;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) {
            return 0;
        }


        
        int count =count(root, (long)targetSum);

        count +=pathSum(root.left , targetSum);
        count+=pathSum(root.right , targetSum);

        return count ;

        
    }
}