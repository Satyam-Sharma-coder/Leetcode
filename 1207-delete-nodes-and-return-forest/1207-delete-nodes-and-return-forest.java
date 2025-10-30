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
    List<TreeNode> ans = new ArrayList<>();
    Set<Integer> set;
    public TreeNode answer(TreeNode root,boolean isroot){
        if(root==null){
            return null;
        }
        boolean delete= set.contains(root.val);
        if(isroot && !delete){
            ans.add(root);
        }
        root.left=answer(root.left,delete);
        root.right=answer(root.right,delete);

        return delete?null:root;
        
    } 
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        set = new HashSet<>();
        for(int a:to_delete){
            set.add(a);
        }
        ans=new ArrayList<>();
        answer(root,true);
        return ans;
        
    }
}