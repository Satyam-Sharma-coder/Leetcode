class Solution {
    class Pair implements Comparable<Pair> {
        char ch;
        int val;
        public Pair(char ch, int val) {
            this.ch = ch;
            this.val = val;
        }
        public int compareTo(Pair other) {
            return Integer.compare(other.val, this.val);
        }
        public String toString() {
            return "(" + ch + ", " + val + ")";
        }
    }

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        if (a > 0) pq.add(new Pair('a', a));
        if (b > 0) pq.add(new Pair('b', b));
        if (c > 0) pq.add(new Pair('c', c));
        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            char ch = top.ch;
            int val = top.val;
            int len = sb.length();
            if (len >= 2 && sb.charAt(len - 1) == ch && sb.charAt(len - 2) == ch) {
                if (pq.isEmpty()) break;
                Pair next = pq.poll();
                sb.append(next.ch);
                if (next.val - 1 > 0) pq.add(new Pair(next.ch, next.val - 1));
                pq.add(top); // put back the previous top
            } else {
                sb.append(ch);
                if (val - 1 > 0) pq.add(new Pair(ch, val - 1));
            }
        }
        return sb.toString();
    }
}