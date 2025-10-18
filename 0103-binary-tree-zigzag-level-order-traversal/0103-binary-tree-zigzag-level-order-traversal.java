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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        boolean changedir=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list = new LinkedList<>();

            while(size-->0){
                TreeNode u= q.poll();
                list.add(u.val);
                if(u.left!=null){
                    q.offer(u.left);
                }
                if(u.right!=null){
                    q.offer(u.right);
                }
            }
            if(changedir){
                Collections.reverse(list);
                changedir=false;
            }
            else{
                changedir=true;
            }
            ans.add(list);
        }
        return ans;
    }
}