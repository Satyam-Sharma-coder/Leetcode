class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));

        int res = 0;
        for(int box=0;box<boxTypes.length;box++){
            if(truckSize<boxTypes[box][0]){
                return res + truckSize*boxTypes[box][1];
            }
            res += boxTypes[box][0] * boxTypes[box][1];
            truckSize -= boxTypes[box][0];
        }
        return res;
    }
}