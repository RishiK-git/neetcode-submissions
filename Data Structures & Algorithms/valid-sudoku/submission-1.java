class Solution {
    public boolean isValidSudoku(char[][] board) {
        

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

                if (board[i / 3][j % 3] != '.' && !square.add(board[i % 3][j / 3])) {
                    return false;
                }
            }

        }

        


        return true;
    }
}
