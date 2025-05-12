class Solution(object):
    def isPossible(self,nums,k,mid):
        k -=1
        sum=0
        for i in nums:
            if(i>mid):
                return False
            if(sum+i>mid):
                k -=1
                sum=0
            sum +=i
        return k>=0
    def splitArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        min_v=min(nums)
        max_v=sum(nums)
        ans=0
        while(min_v<=max_v):
            mid=(min_v+max_v)/2
            if(self.isPossible(nums,k,mid)):
                ans=mid
                max_v=mid-1
            else:
                min_v=mid+1
        return ans
        