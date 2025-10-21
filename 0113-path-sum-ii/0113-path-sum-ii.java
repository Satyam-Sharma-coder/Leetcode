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
    List<List<Integer>> ans;
    public void paths(TreeNode root, int targetSum,List<Integer> list){
        if(root==null) return;
        targetSum-=root.val;
        list.add(root.val);
        if(targetSum==0 && root.left==null && root.right==null){
            ans.add(new ArrayList<>(list));
        }
        paths(root.left,targetSum,list);
        paths(root.right,targetSum,list);
        list.remove(list.size()-1);
        targetSum+=root.val;

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        paths(root,targetSum,new ArrayList<>());
        return ans;
    }
}