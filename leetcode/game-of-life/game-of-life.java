class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==1){
                    int c=neighbours(board,i,j);
                    if(c<2)copy[i][j]=0;
                    else if(c>3)copy[i][j]=0;
                }
                else{
                    int c=neighbours(board,i,j);
                    if(c==3)copy[i][j]=1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = copy[i][j];
            }
        }
    }
    int neighbours(int[][] matrix, int i, int j) {
        if (matrix == null || matrix.length == 0 ||
                i < 0 || i >= matrix.length ||
                matrix[i] == null || j < 0 || j >= matrix[i].length) {
            return 0;
        }

        int sum = 0;

        for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {
                if (di == 0 && dj == 0)
                    continue;
                int ni = i + di;
                int nj = j + dj;

                if (ni >= 0 && ni < matrix.length &&
                        matrix[ni] != null &&
                        nj >= 0 && nj < matrix[ni].length) {
                    sum += matrix[ni][nj];
                }
            }
        }
        return sum;
    }
}