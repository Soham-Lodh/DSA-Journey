class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        List<Integer> nums=new ArrayList<>();
        while (startRow <= endRow && startCol <= endCol && startRow < arr.length && startCol < arr[0].length
                && endRow >= 0 && endCol >= 0) {
            for (int i = startCol; i < endCol; i++) {
                nums.add(arr[startRow][i]);
            }
            for (int i = startRow; i <= endRow; i++) {
                nums.add(arr[i][endCol]);
            }
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    nums.add(arr[endRow][i]);
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    nums.add(arr[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return nums;
    }
}