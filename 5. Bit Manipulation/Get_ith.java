public class Get_ith {
    static boolean get(int num,int i){
        num=num>>i;
        return (num&1)==0;
    }
    public static void main(String[] args) {
        int num=5;
        int i=0;
        if(get(num, i))System.out.println("0");
        else System.out.println("1");
    }
}
