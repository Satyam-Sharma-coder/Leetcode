class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] seatsFreq = new int[101]; 
        int[] studentsFreq = new int[101];
        
        for (int seat : seats) {
            seatsFreq[seat]++;
        }
        for (int student : students) {
            studentsFreq[student]++;
        }
        
        int ans = 0;
        int i = 1, j = 1; 
        
        while (i <= 100 && j <= 100) {
            while (i <= 100 && seatsFreq[i] == 0) {
                i++;
            }
            while (j <= 100 && studentsFreq[j] == 0) {
                j++;
            }
            if (i <= 100 && j <= 100) {
                int moves = Math.min(seatsFreq[i], studentsFreq[j]); 
                ans += moves * Math.abs(i - j); 
                seatsFreq[i] -= moves;
                studentsFreq[j] -= moves;
            }
        }
        return ans;
    }
}
