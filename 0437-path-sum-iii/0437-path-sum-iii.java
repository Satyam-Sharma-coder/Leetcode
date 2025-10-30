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
    int count;
    long sum;
    Map<Long,Integer> map;
    public void answer(TreeNode root, int targetSum){
        if(root==null){
            return;
        }
        sum += root.val;
        if(map.containsKey(sum-targetSum)){
            count+=map.get(sum-targetSum);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        answer(root.left,targetSum);
        answer(root.right,targetSum);
        map.put(sum,map.get(sum)-1);
        sum-=root.val;
    }
    public int pathSum(TreeNode root, int targetSum) {
        count=0;
        sum=0;
        map=new HashMap<>();
        map.put(0L,1);
        answer(root,targetSum);
        return count;
    }
}