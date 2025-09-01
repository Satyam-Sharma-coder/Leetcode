class Solution:
    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
        matrix: List[List[int]]=[[0 for _ in range(n)] for _ in range(m)]
        for i in indices:
            row=i[0]
            col=i[1]
            for j in range(n):
                matrix[row][j] +=1
            for j in range(m):
                matrix[j][col] += 1
        count=0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j]%2 is not 0:
                    count +=1
        return count