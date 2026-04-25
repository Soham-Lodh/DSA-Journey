import java.util.Arrays;
public class Fibonaci {
    public static void main(String[] args) {
        int n = 25;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        if(n>0)dp[1]=1;
        System.out.println("Fibonacci of " + n + " is: " + fib_n(n,dp));
    }
    static int fib_n(int n,int[]dp){
        if(dp[n]==-1){
            dp[n]=fib_n(n-1,dp)+fib_n(n-2,dp);
        }
        return dp[n];
    }
}
