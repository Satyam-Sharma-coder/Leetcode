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
    int index=0;
    int[] preorder;
    Map<Integer,Integer> map;
    private TreeNode buildTree(int i,int j){
        if(i>j) return null;
        TreeNode root = new TreeNode(preorder[index++]);
        int idx=map.get(root.val);
        root.left=buildTree(i,idx-1);
        root.right=buildTree(idx+1,j);
        return root;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        if(preorder.length==1) return new TreeNode(preorder[0]);
        this.preorder=preorder;
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildTree(0,preorder.length-1);
    }
}