class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && !visited[i][j]){
                    long sum=sum(grid,i,j,visited);
                    if(sum%k==0)count++;
                }
            }
        }
        return count;
    }
    long sum(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            visited[i][j] || grid[i][j] == 0) {
            return 0;
        }

        visited[i][j] = true;

        long s = grid[i][j];

        s += sum(grid, i - 1, j, visited);
        s += sum(grid, i + 1, j, visited);
        s += sum(grid, i, j - 1, visited);
        s += sum(grid, i, j + 1, visited);

        return s;
    }
}