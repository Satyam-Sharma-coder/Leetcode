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
 3,0

 5,3
 5,4
 */
class Solution {
    int max=Integer.MIN_VALUE;
    public int[] ans(TreeNode curr){
        if(curr==null){
            return new int[]{0,0};
        }
        int[] robberleft=ans(curr.left);
        int[] robberright=ans(curr.right);
        int robber=curr.val+robberleft[1]+robberright[1];
        int notrobber=Math.max(robberleft[0]+robberright[0],Math.max(robberleft[1]+robberright[1],Math.max(robberleft[1]+robberright[0],robberleft[0]+robberright[1])));
        return new int[]{robber,notrobber};

    }
    public int rob(TreeNode root) {
        int[] ansv=ans(root);
        return Math.max(ansv[0],ansv[1]);
    }
}