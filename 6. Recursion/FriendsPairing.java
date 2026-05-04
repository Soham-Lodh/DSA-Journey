public class FriendsPairing {
    static int ways(int n,int dp[]){
        if(dp[n]!=-1)return dp[n];
        dp[n]=ways(n-1,dp)+((n-1)*ways(n-2,dp));
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++)dp[i]=-1;
        dp[0]=1;dp[1]=1;
        System.out.println(ways(n,dp));
    }
}
