class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ROWS, COLS = len(board), len(board[0])
        visited = set()

        def dfs(row, col):
            nonlocal curr
            if row < 0 or row == ROWS or col < 0 or col == COLS or (row, col) in visited:
                return False  # CHANGED: nothing was added yet, so nothing to undo

            visited.add((row, col))
            curr += board[row][col]
            if not word.startswith(curr):  # CHANGED: prune as soon as curr stops matching
                curr = curr[:-1]
                visited.remove((row, col))
                return False

            # CHANGED: save the result so this call can clean up if it failed
            found = curr == word or dfs(row + 1, col) or dfs(row - 1, col) or dfs(row, col + 1) or dfs(row, col - 1)
            if not found:
                curr = curr[:-1]
                visited.remove((row, col))
            return found

        curr = ""
        for row in range(ROWS):
            for col in range(COLS):
                if dfs(row, col):
                    return True
                curr = ""
                visited.clear()

        return False