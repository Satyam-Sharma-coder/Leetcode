class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=candies[0];
        List<Boolean> b = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;
    }
}