class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int i=0;
        while(i<costs.length){
            sum+= costs[i];
            if(sum>coins) break;
            i++;
        }
        return i;
    }
}