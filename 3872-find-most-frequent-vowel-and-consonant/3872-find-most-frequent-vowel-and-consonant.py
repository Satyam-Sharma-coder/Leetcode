class Solution:
    def maxFreqSum(self, s: str) -> int:
        freq=[0]*26
        for i in s:
            freq[ord(i)-ord('a')]+=1
        maxv=0
        maxc=0
        vowel=[0,4,8,14,20]
        for i in range(len(freq)):
            if i in vowel:
                maxv=max(maxv,freq[i])
            else:
                maxc=max(maxc,freq[i])
        return maxc+maxv