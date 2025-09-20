class Solution {
    static boolean[][] visit;

    public boolean exist(char[][] board, String word) {
        visit = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if((word.charAt(0) == board[i][j]) && find(board, word, i, j, 0))   return true;
            }
        }

        return false;
    }

    private boolean find(char[][] board, String word, int i, int j, int index){
        if(index == word.length()) return true;

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || visit[i][j]) return false;

        visit[i][j] = true;

        if(find(board, word, i + 1, j, index + 1) || find(board, word, i - 1, j, index + 1) || find(board, word, i, j - 1, index + 1)
        || find(board, word, i, j + 1, index + 1))  return true;

        visit[i][j] = false;
        return false;
    }
}