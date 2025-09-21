class Solution {
    public void helper(int[] candidates, int i, List<Integer> temp,List<List<Integer>> ans,int target){
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<candidates.length;j++){
            temp.add(candidates[j]);
            helper(candidates,j,temp,ans,target-candidates[j]);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,0,temp,ans,target);
        return ans;
    }
}