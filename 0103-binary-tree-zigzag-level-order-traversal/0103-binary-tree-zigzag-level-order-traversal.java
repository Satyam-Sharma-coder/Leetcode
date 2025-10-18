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
    public void zigzag(List<List<Integer>> ans, int level, TreeNode root){
        if(root==null){
            return;
        }
        if(level==ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        zigzag(ans,level+1,root.left);
        zigzag(ans,level+1,root.right);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        zigzag(ans,0,root);
        for(int i=0;i<ans.size();i++){
            if(i%2!=0){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}