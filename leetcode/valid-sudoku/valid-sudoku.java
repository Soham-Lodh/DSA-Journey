class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                for(int k=0;k<9;k++){
                    if(k!=j && board[i][k]==board[i][j]) return false;
                }
                for(int k=0;k<9;k++){
                    if(k!=i && board[k][j]==board[i][j]) return false;
                }
                int sr=(i/3)*3;
                int sc=(j/3)*3;
                for(int k=sr;k<sr+3;k++){
                    for(int m=sc;m<sc+3;m++){
                        if(k!=i && m!=j && board[k][m]==board[i][j])return false;
                    }
                }

            }
        }
        return true;
    }
}