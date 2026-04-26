public class Pow_Optimized {
    static int power(int x,int n){
        if(n==0)return 1;
        else if(n==1)return x;
        int ap=power(x,n/2);
        if(n%2==0)return ap*ap;
        else return x*ap*ap;
        
    }
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(power(x,n));
    }
}
