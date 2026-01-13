class Solution {
    public void setZeroes(int[][] matrix) {
        int copy[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                copy[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int k=0,l=0;
                    while(k<matrix.length){
                        copy[k][j]=0;
                        k++;
                    }
                    while(l<matrix[0].length){
                        copy[i][l]=0;
                        l++;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=copy[i][j];
            }
        }
    }
}