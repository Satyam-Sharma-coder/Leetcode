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
    int count=0;
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int rootleft=dfs(root.left);
        int rootright=dfs(root.right);

        if(rootleft==-1 || rootright==-1){
            count++;
            return 1;
        }
        if(rootleft==1|| rootright==1){
            return 0;
        }
        return -1;
    }
    
    public int minCameraCover(TreeNode root) {
        if(root.left==null && root.right==null) return 1;
        int ans=dfs(root);
        return ans==-1?count+1:count;
    }
}