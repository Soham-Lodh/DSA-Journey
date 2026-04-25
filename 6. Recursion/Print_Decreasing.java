class Print_Decreasing{
    static void print_decreasing(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print_decreasing(n-1);
    }
    public static void main(String[] args){
        int n=10;
        print_decreasing(n);
    }
}