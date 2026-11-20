class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ROWS, COLS = len(board), len(board[0])
        visited = set()

        def dfs(row, col):
            nonlocal curr
            if row < 0 or row == ROWS or col < 0 or col == COLS or (row, col) in visited:
                return False

            visited.add((row, col))
            curr += board[row][col]
            if curr != word and len(curr) == len(word):
                curr = curr [:-1]
                visited.remove((row, col))
                return False
            return curr == word or dfs(row + 1, col) or dfs(row - 1, col) or dfs(row, col + 1) or dfs(row, col - 1)

        curr = ""
        for row in range(ROWS):
            for col in range(COLS):
                if dfs(row, col):
                    return True
                curr = ""
                visited.clear()

        return False
