class Solution:
    def digits(self,n) -> int:
        count=0
        while n is not 0:
            n=n//10
            count += 1
        return count

    def findNumbers(self, nums: List[int]) -> int:
        count=0
        for i in nums:
            if self.digits(i)%2 is 0:
                count += 1
        return count
        