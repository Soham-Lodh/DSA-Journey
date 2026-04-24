public class Clear_last_ith {
    static int clear(int num,int i){
        return (num&((~0)<<i));
    }
    public static void main(String[] args) {
        int num=10;
        int i=2;
        System.out.println(clear(num, i));
    }   
}
