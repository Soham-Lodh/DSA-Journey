class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[2];
        HashSet<Integer> hs=new HashSet<>();
        int n=grid.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(hs.contains(grid[i][j]))arr[0]=grid[i][j];
                else{
                    hs.add(grid[i][j]);
                    sum+=grid[i][j];
                }
            }
        }
        n=(n*n);
        arr[1]=(n*(n+1)/2)-sum;
        return arr;
    }
}