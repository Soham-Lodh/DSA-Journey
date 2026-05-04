public class RemoveDuplicates {
    static void unique(String str,StringBuilder sb,boolean map[],int i){
        if(i>=str.length())return;
        if(!map[str.charAt(i)-'a']){
            sb.append(str.charAt(i));
            map[str.charAt(i)-'a']=true;
        }
        unique(str,sb,map,i+1);
    }
    public static void main(String[] args) {
        String str="helloiamsohamlodh";
        boolean map[]=new boolean[26];
        StringBuilder sb=new StringBuilder();
        unique(str,sb,map,0);
        System.out.println(sb);
    }
}
    