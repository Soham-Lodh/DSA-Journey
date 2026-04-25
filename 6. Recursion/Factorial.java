public class Factorial {
    static int fac(int n){
        if(n==0 || n==1) return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fac(n));
    }
}
