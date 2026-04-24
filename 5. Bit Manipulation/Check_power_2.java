public class Check_power_2 {
    static boolean check(int num){
        return num>0 && (num&(num-1))==0;
    }
    public static void main(String[] args) {
        int num=16;
        if(check(num)){
            System.out.println(num+" is a power of 2");
        }else{
            System.out.println(num+" is not a power of 2");
        }
    }
}
