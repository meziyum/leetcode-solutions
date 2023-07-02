
class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
    }

    public static boolean backtrack(char[][] board, int row, int col) {
        if (row==board.length-1 && col==board[0].length) {
            return true;
        }

        if (col==board[0].length) return backtrack(board, row+1, 0);

        if (board[row][col] != '.') return backtrack(board, row, col+1);

        for (char digit='1'; digit<='9'; digit++) {
            if(isValid(row, col, digit, board)) {
                board[row][col]=digit;
                if (backtrack(board, row, col+1)) return true;
                board[row][col]='.';
            }
        }

        return false;
    }

    public static boolean isValid(int row, int col, char digit, char[][] board) {
        for (int i=0; i<9; i++){
            if (board[row][i] == digit) return false;

            if (board[i][col] == digit) return false;

            int c=3*(col/3)+i%3;
            int r=3*(row/3)+i/3;

            if (board[r][c] == digit) {
                return false;
            }
        }
        return true;
    }
}
