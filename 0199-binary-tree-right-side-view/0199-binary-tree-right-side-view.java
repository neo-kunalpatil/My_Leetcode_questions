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
    public int level(TreeNode root) {
        if(root==null) {
            return 0;
        }

        return 1+ Math.max(level(root.right) , level(root.left));
    }

public void preorder(TreeNode root , int level, List<Integer> ans) {
    if(root==null) {
        return;
    }
    
    preorder(root.left, level+1, ans);
    ans.set(level, root.val);
    preorder(root.right, level+1,ans);
}

    public List<Integer> rightSideView(TreeNode root) {
  List<Integer> ans = new ArrayList<>();
    for(int i=0;i<level(root); i++) {
        ans.add(0);
        
    }

    preorder(root,0, ans);

    return ans;
        
    }
}