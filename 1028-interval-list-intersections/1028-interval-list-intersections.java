class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0;
        int j=0;
        List<int[]> ans = new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            int start = Math.max(firstList[i][0],secondList[j][0]);
            int end = Math.min(firstList[i][1],secondList[j][1]);
            if(start<=end){
                ans.add(new int []{start,end});
            }
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans.toArray(new int [ans.size()][2]);
    }
}