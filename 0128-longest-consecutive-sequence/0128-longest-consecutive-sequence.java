class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        // creating hashset
        HashSet <Integer> set = new HashSet<>();
        // putting array in hashset
        for(int i =0; i<n; i++){
            set.add(nums[i]);
        }
        //finding longest sequence
        //1st:Iterate in set
        for (int start : set){
            if(!set.contains(start-1)){
                int cnt = 1;
                int x = start;
                while(set.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;


    }
}


// 100  4 200 1 3 2 