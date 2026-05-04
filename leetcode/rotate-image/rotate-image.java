class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++)reverse(matrix[i]);
    }
    void transpose(int arr[][]){
        int m=arr.length;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}