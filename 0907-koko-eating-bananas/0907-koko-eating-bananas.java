class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int hi = 0;
        for (int i : piles) {
            hi = Math.max(hi, i);
        }

        while (l < hi) {
            int mid = (l + hi) / 2;
            int x = isPossible(piles, mid);
            if (x <= h) {
                hi = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    public static int isPossible(int[] piles, int mid) {
        int currhrs = 0;
        for (int i : piles) {
            int time = (i + mid - 1) / mid; // Efficient ceil(i / mid)
            currhrs += time;
        }
        return currhrs;
    }
}
