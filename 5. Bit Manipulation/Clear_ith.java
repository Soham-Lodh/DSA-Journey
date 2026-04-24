public class Clear_ith {
    static int clear(int num,int i){
        int bitmas=~(1<<i);
        return (num&bitmas);
    }
    public static void main(String[] args) {
        int num=10;
        int i=1;
        System.out.println(clear(num, i));
    }
}
