class TilingProblem{
    public static void main(String[] args) {
        int n=4;
        System.out.println(ways(n));
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)arr[i]=-1;
        arr[0]=1;
        arr[1]=1;
        System.out.println(ways_optimized(n,arr));
    }
    static int ways(int n){
        if(n==0||n==1)return 1;
        return ways(n-1)+ways(n-2);
    }
    static int ways_optimized(int n,int arr[]){
        if(arr[n]!=-1)return arr[n];
        arr[n]=ways_optimized(n-1,arr)+ways_optimized(n-2,arr);
        return arr[n];
    }
}