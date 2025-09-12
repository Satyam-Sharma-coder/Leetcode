class Solution:
    def doesAliceWin(self, s: str) -> bool:
        for i in s:
            if i in "AEIOUaeiou":
                return True
        return False