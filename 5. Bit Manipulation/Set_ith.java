public class Set_ith {
    static int set(int num,int i){
        int bitmas=1<<i;
        return num|bitmas;
    }
    public static void main(String[] args) {
        int num=10;
        int i=2;
        System.out.println(set(num, i));
    }
}
