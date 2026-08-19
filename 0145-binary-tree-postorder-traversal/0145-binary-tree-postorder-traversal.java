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

    
    public List<Integer> postorderTraversal(TreeNode root) {
List<Integer> ans = new ArrayList<>();
Stack<TreeNode> st= new Stack<>();


if(root!=null) {
            st.push(root);
        }
 while(st.size()>0) {
    TreeNode elen= st.pop();
    int val = elen.val;
    ans.add(val);

        if(elen.left!=null) {
        st.push(elen.left);
        }
if(elen.right!=null) {
st.push(elen.right);
        }

    }
        
        Collections.reverse(ans);

        return ans;

        
    }
}