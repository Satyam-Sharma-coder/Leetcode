class Solution {
    public void helper(int index,int k,int n,List<Integer> temp,List<List<Integer>> ans){
        if(k==0 && n==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(k==0 || n<=0){
            return;
        }
        for(int i=index;i<=Math.min(9,n);i++){
            temp.add(i);
            helper(i+1,k-1,n-i,temp,ans);
            temp.remove(temp.size()-1);
        }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}