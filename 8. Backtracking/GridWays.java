public class GridWays {
    static int ways_backtrack(int maxN,int maxM,int n,int m){
        if(n>=maxN || m>=maxM)return 0;
        else if(n==maxN-1 && m==maxM-1){
            return 1;
        }
        else{
            int count=0;
            count+=ways_backtrack(maxN,maxM,n+1,m);
            count+=ways_backtrack(maxN,maxM,n,m+1);
            return count;
        }
    }
    static int factorial(int n,int dp[]){
        if(dp[n]!=-1)return dp[n];
        return dp[n]=n*factorial(n-1,dp);
    }
    static int ways_combination(int n,int m){
        int dp[]=new int[n+m];
        for(int i=0;i<dp.length;i++)dp[i]=-1;
        dp[0]=1;
        dp[1]=1;
        return factorial(n+m-2,dp)/(factorial(n-1,dp)*factorial(m-1,dp));
    }
	public static void main(String[] args) {
		System.out.println(ways_backtrack(3,3,0,0));
        System.out.println(ways_combination(3,3));
	}
}
