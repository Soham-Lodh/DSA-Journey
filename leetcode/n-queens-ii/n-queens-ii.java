class Solution {
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        return ways(board,0,0);
    }
    static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    int ways(char board[][],int i,int count){
        if(i==board.length){
            return count+1;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,i,j)){
                board[i][j]='Q';
                count=ways(board,i+1,count);
                board[i][j]='X';
            }
        }
        return count;
    }
}