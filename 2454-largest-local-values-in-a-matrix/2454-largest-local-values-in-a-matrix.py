class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        matrix: List[List[int]] = [[0 for _ in range(len(grid[0])-2)] for _ in range(len(grid)-2)]
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                maxv=0
                for k in range(i,i+3):
                    for l in range(j,j+3):
                        maxv=max(maxv,grid[k][l])
                matrix[i][j]=maxv
        return matrix
