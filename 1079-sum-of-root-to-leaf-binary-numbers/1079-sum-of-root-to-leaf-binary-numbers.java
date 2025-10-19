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
    public int dfs(int sum,TreeNode root){
        if(root==null){
            return 0;
        }
        int val=root.val+ (2*sum);
        if(root.right==null && root.left==null){
            return val;
        }
        return dfs(val,root.left)+dfs(val,root.right);
    }
    public int sumRootToLeaf(TreeNode root) {
        return dfs(0,root);
    }
}