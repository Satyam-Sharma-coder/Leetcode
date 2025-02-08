class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min = 1;
        int max =position[position.length - 1] - position[0];
        int mid = 0;
        int ans=0;
        while(min <= max){
            mid =(min + max)/2;
            if(isPossible(position, mid, m)){
                ans=mid;
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        return ans;

    }
    public boolean isPossible(int[] position, int mid, int m){
        m= m-1;
        int j=0;
        for(int i=1;i<position.length;i++){
            if(position[i] - position[j] >= mid){
                m--;
                j=i;
            }
        }
        return m<=0;
    }
}