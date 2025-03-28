class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int[] ans=new int[2];
        int l = grid.length*grid.length;
        for(int i=1;i<=l;i++){
            if(!map.containsKey(i)){
                ans[1]=i;
            }else{
                if(map.get(i)!=1) ans[0]=i;
            }
        }
        return ans;

    }
}