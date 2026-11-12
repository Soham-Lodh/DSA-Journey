class Solution {
    int t=0;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int visited[][]=new int[m][n];
        int si=0,sj=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=-1)t++;
                if(grid[i][j]==1){
                    si = i;
                    sj = j;
                }
            }
        }
        visited[si][sj] = 1;
        return path(grid, visited, si + 1, sj, 1) + path(grid, visited, si, sj + 1, 1) + path(grid, visited, si - 1, sj, 1) + path(grid, visited, si, sj - 1, 1);
    }
    int path(int grid[][],int visited[][],int i,int j,int count){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 0;
        if (visited[i][j] == 1)return 0;
        if (grid[i][j] == -1) return 0;
        if (grid[i][j] == 2) return (count + 1 == t) ? 1 : 0;
        else{
            visited[i][j]=1;
            int c1=path(grid,visited,i+1,j,count+1);
            int c2=path(grid,visited,i,j+1,count+1);
            int c3=path(grid,visited,i-1,j,count+1);
            int c4=path(grid,visited,i,j-1,count+1);
            visited[i][j]=0;
            return c1+c2+c3+c4;
        }
    }
}