class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(int k=1;k<=9;k++){
                        if(isSafe(board,i,j,k)){
                            board[i][j]=(char)(k+'0');
                            if(solve(board))return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isSafe(char board[][],int i,int j, int digit){
        for(int k=0;k<board.length;k++){
            if(board[k][j]=='.')continue;
            int num=board[k][j]-'0';
            if(num==digit)return false;
        }
        for(int k=0;k<board.length;k++){
            if(board[i][k]=='.')continue;
            int num=board[i][k]-'0';
            if(num==digit)return false;
        }
        int sr=i-(i%3);
        int sc=j-(j%3);
        for(int k=sr;k<sr+3;k++){
            for(int l=sc;l<sc+3;l++){
                if(board[k][l]=='.')continue;
                int num=board[k][l]-'0';
                if(num==digit)return false;
            }
        }
        return true;
    }
}