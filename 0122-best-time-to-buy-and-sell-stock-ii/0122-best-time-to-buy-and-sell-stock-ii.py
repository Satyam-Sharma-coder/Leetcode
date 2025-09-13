class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices)==1:
            return 0
        maxp=0
        buy=prices[0]
        profit=0
        for i in range(1,len(prices)):
            if prices[i]<prices[i-1]:
                profit+=maxp
                buy=prices[i]
                maxp = 0 
            else:
                maxp=abs(buy-prices[i])
        if prices[-1]>=prices[-2]:
            return profit+maxp
        return profit