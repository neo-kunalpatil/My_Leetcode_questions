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

 class Pair {
    TreeNode node;
    int level;
    Pair(TreeNode node, int level) {
        this.node=node;
        this.level=level;
    }
    }
class Solution {

private int levels(TreeNode root) {
        if(root == null) {
            return 0;
        }
int left = levels(root.left);
int right= levels(root.right);
        return 1+ Math.max(left ,right);
   }


    private void level(TreeNode root,List<List<Integer>> res) {
        
        Queue<Pair> p = new LinkedList<>();

        if(root!=null) {
            p.add(new Pair(root,0));
        }
        while(p.size()>0) {
        Pair pr= p.remove();
        TreeNode n= pr.node;
        int lvl= pr.level;

     res.get(lvl).add(n.val);
        // System.out.print(n.val+ " ");
        if(n.left!=null) {
            p.add(new Pair(n.left, lvl+1));
        }
        if(n.right!=null) {
            p.add(new Pair(n.right, lvl+1));
        }
    }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        
  
        for(int x=0; x<levels(root);x++) {
            List<Integer> ans= new ArrayList<>();
         res.add(ans);
        }
        level(root ,res);
        return res;


        
    }
}


//     private static List<Integer> level(TreeNode root,int n, int level,List<Integer> ans ) {
//         if(root== null) {
//             return ans;
//         }

//         if(level==n) {
//             ans.add(root.val);
//             return ans;
//         }

//         level(root.left,n,level+1,ans);
//         level(root.right,n,level+1,ans);

//       return ans;
//     }
    
    
    
    
