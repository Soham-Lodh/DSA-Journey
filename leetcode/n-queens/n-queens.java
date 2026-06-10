class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> list=new ArrayList<>();
        solve(board,0,list);
        return list;
    }
    void solve(char board[][],int row,List<List<String>> list){
        if(row==board.length){
            List<String> lst=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<board.length;j++){
                    sb.append(board[i][j]);
                }
                lst.add(sb.toString());
            }
            list.add(lst);
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                solve(board,row+1,list);
                board[row][j]='.';
            }
        }
    }
    boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }

}