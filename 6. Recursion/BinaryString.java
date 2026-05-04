public class BinaryString {
    static void Strings(int n,String sb,char lp){
        if(n==0){
            System.out.println(sb);
            return;
        }
        else if(lp=='0'){
            Strings(n-1,sb+"1",'1');
        }
        Strings(n-1,sb+"0",'0');
    }
    public static void main(String[] args) {
        int n=2;
        Strings(n,"",'0');
    }
}
