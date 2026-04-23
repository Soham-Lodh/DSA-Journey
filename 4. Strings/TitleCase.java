class TitleCase{
    static String title_case(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(sb.charAt(i-1)==' ' && i<str.length()-1)sb.append(Character.toUpperCase(str.charAt(i)));
            else sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hello wORLD";
        System.out.println(title_case(str));
    }
}