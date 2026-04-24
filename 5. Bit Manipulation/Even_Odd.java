public class Even_Odd {
    static boolean check(int num){
        return (num&1)==0;
    }
    public static void main(String args[]){
        int n=6;
        if(check(n))System.out.println("Even");
        else System.out.println("Odd");
    }

}
