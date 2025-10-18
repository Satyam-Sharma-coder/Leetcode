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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list = new LinkedList<>();
            while(size-->0){
                TreeNode u= queue.poll();
                list.add(u.val);
                if(u.left!=null){
                    queue.offer(u.left);
                }
                if(u.right!=null){
                    queue.offer(u.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}