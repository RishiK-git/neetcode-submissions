class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        visit = set()

        def dfs(r, c):
            if r < 0 or r == ROWS or c < 0 or c == COLS or grid[r][c] == 0 or (r, c) in visit:
                return 0
            
            visit.add((r, c)) 
            area = 1
            directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]
            for direction in directions:
                dr = r + direction[0]
                dc = c + direction[1]
                area += dfs(dr, dc)
            
            return area
        
        most_area = 0
        for i in range(ROWS):
            for j in range(COLS):
                most_area = max(most_area, dfs(i, j))
            
        return most_area


