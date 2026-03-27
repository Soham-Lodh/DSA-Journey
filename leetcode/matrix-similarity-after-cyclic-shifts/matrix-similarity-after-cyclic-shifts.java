class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int copy[][]=new int [mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                copy[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<mat.length;j++){
                if(j%2==0)lshift(mat[j]);
                else rshift(mat[j]);
            }
        }
        return check(mat,copy);
    }
    public void lshift(int mat[]){
        int l=mat[0];
        for(int i=1;i<mat.length;i++){
            mat[i-1]=mat[i];
        }
        mat[mat.length-1]=l;
    }
    public void rshift(int mat[]){
        int r=mat[mat.length-1];
        for(int i=mat.length-1;i>0;i--){
            mat[i]=mat[i-1];
        }
        mat[0]=r;
    }
    public boolean check(int mat[][],int copy[][]){
        if(mat.length!=copy.length || mat[0].length!=copy[0].length)return false;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<copy[0].length;j++){
                if(mat[i][j]!=copy[i][j])return false;
            }
        }
        return true;
    }
}