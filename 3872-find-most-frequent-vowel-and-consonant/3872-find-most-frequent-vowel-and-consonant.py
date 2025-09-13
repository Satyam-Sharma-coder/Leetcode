from collections import Counter

class Solution:
    def maxFreqSum(self, s: str) -> int:
        freq = Counter(s)
        vowels = set("aeiou")

        maxv = max((freq[ch] for ch in vowels if ch in freq), default=0)
        maxc = max((freq[ch] for ch in freq if ch not in vowels), default=0)

        return maxv + maxc
