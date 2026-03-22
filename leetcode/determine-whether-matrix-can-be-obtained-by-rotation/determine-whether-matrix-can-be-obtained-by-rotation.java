class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (mat.length != mat[0].length)return false;
        if(areEqual(mat,target))return true;
        int n = mat.length;
        int m = mat[0].length;
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            copy = rotate(copy);
            if (areEqual(copy, target))
                return true;
        }
        return false;

    }

    int[][] rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] grid = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            reverse(grid[i]);
        }
        return grid;
    }

    void reverse(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }

    boolean areEqual(int[][] a, int[][] b) {
        if (a == null || b == null)
            return a == b;
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length)
                return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j])
                    return false;
            }
        }
        return true;
    }
}