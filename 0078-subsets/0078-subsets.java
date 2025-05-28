class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        fun(0, nums, new ArrayList<>());
        return ans;
    }
    public void fun(int i, int[] nums, List<Integer> list){

        if(i == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        fun(i + 1, nums, list);
        list.remove(list.size() - 1);
        fun(i + 1, nums, list);
    }
}