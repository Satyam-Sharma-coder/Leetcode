class Solution:
    def sortVowels(self, s: str) -> str:

        lis = list(s)
        contain=[]
        for i in lis:
            if i in "AEIOUaeiou":
                contain.append(i)
        contain.sort()
        p=0
        for i in range(len(lis)):
            if lis[i] in "AEIOUaeiou":
                lis[i]=contain[p]
                p+=1
        return ''.join(lis)
            