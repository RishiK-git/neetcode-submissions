class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[] boxes = new HashSet[9];
        for (int k = 0; k < 9; k++) {
            boxes[k] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++){
            
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> square = new HashSet<>();
            
            for(int j = 0; j < board[i].length; j++){
                
               if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !column.add(board[j][i])) {
                    return false;
                }
                
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (board[i][j] != '.' && !boxes[boxIndex].add(board[i][j])) {
                    return false;
                }

            }

        }

        


        return true;
    }
}
