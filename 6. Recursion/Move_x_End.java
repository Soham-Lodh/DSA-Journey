public class Move_x_End {
    static StringBuilder last(String str,int idx,int count,StringBuilder sb){
        if(idx>=str.length()){
            for(int i=1;i<=count;i++)sb.append("x");
            return sb;
        }
        if(str.charAt(idx)=='x')count++;
        else{
            sb.append(str.charAt(idx));
        }
        return last(str,++idx,count,sb);
    }
    public static void main(String[] args) {
        String str="axxbdxcefxhix";
        StringBuilder sb=new StringBuilder();
        System.out.println(last(str,0,0,sb));
    }
}
