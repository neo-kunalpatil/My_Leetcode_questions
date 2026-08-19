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
    static boolean ans;
    public int levelss(TreeNode root) {
        if(root==null) {
            return 0;
        }
int leftnode = levelss(root.left);
int rightnode=levelss(root.right);
int diff= Math.abs(leftnode - rightnode);
if(diff>1) {
    ans=false;
}

return 1+ Math.max(leftnode , rightnode);
    }

    public boolean isBalanced(TreeNode root) {
        ans=true;
        levelss(root);


        return ans;
        
    }
}




// if(root==null) {
//             return 0;
//         }

//         return 1+ Math.max(level(root.right), level(root.left));
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) {
//             return true;
//         }
//         int diff= Math.abs(level(root.left)- level(root.right));
//         if(diff>1) {
//             return false;
//         }

//         return isBalanced(root.left) && isBalanced(root.right);
        