class Solution {
    public int climbStairs(int n) {
        if(n<=2)return n;
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        return climb(n,arr);

    }
    int climb(int n,int[] arr){
        if(arr[n]!=-1)return arr[n];
        else{
            arr[n]=climb(n-1,arr)+climb(n-2,arr);
            return arr[n];
        }
    }
}