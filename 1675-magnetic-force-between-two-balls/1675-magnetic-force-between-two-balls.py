class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:

        def isPossible(position: List[int], m: int,mid: int):
            count=1
            j=position[0]
            for i in range(1,len(position)):
                force=position[i]-j
                if(force>=mid):
                    count += 1
                    j=position[i]
            return count>=m
        position.sort()
        min_v=1
        max_v=position[-1]-position[0]
        answer=0
        while(min_v<=max_v):
            mid=(min_v+max_v)//2
            if(isPossible(position,m,mid)):
                answer=mid
                min_v=mid+1
            else:
                max_v=mid-1
        return answer