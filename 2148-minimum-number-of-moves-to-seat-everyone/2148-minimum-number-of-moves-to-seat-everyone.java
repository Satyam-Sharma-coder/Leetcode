class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] seatsFreq = new int[101];  // Frequency array for seat positions
        int[] studentsFreq = new int[101];  // Frequency array for student positions
        
        // Fill the frequency arrays
        for (int seat : seats) {
            seatsFreq[seat]++;
        }
        for (int student : students) {
            studentsFreq[student]++;
        }
        
        int ans = 0;
        int i = 1, j = 1; // Start from position 1
        
        while (i <= 100 && j <= 100) {
            // Find the next available seat
            while (i <= 100 && seatsFreq[i] == 0) {
                i++;
            }
            // Find the next student needing a seat
            while (j <= 100 && studentsFreq[j] == 0) {
                j++;
            }
            
            // If both i and j have valid entries
            if (i <= 100 && j <= 100) {
                int moves = Math.min(seatsFreq[i], studentsFreq[j]); // Pair students with seats
                ans += moves * Math.abs(i - j); // Compute the movement cost
                seatsFreq[i] -= moves;
                studentsFreq[j] -= moves;
            }
        }
        return ans;
    }
}
