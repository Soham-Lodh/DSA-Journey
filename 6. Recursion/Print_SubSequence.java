public class Print_SubSequence {
    static void print(String str,int idx,String s){
        if(idx>=str.length()){
            System.out.println(s);
            return;
        }
        print(str,(idx+1),s+str.charAt(idx));
        print(str,(idx+1),s);
    }
    public static void main(String[] args) {
        String str = "abc";
        print(str,0,"");
    }
}
