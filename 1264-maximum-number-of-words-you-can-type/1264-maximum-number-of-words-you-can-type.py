class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        l=text.split(" ")
        count=len(l)
        for i in l:
            for j in i:
                if j in brokenLetters:
                    count-=1
                    break
        return count