public class Clear_range {
    static int clear(int num,int i,int j){
        int bitmask=(~0)<<(j+1);
        int bitmask1=~((~0)<<i);
        bitmask=(bitmask|bitmask1);
        return (num&bitmask);
    }
    public static void main(String[] args) {
        int num=15;
        int i=1;
        int j=2;
        System.out.println(clear(num, i, j));
    }
}
