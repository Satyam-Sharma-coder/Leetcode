class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] freq = new int[50000];  // Frequency array
        int[] firstIndex = new int[50000];  // First occurrence
        int[] lastIndex = new int[50000];   // Last occurrence
        
        int maxFreq = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (freq[nums[i]] == 0) {
                firstIndex[nums[i]] = i; // Store first occurrence
            }
            lastIndex[nums[i]] = i; // Update last occurrence
            freq[nums[i]]++; // Increase frequency
            
            maxFreq = Math.max(maxFreq, freq[nums[i]]);
        }

        int minLength = nums.length;
        
        for (int i = 0; i < 50000; i++) {
            if (freq[i] == maxFreq) {
                minLength = Math.min(minLength, lastIndex[i] - firstIndex[i] + 1);
            }
        }

        return minLength;
    }
}