import java.util.*;
public class decode_string {
    static String decoder(String s){
        Stack<Character> stack=new Stack<>();
        Stack<Integer> nums=new Stack<>();
        int i=0;
        int n=0;
        while(i<s.length()){
            if(s.charAt(i)==']'){
                StringBuilder sb=new StringBuilder();
                while(!stack.isEmpty() && stack.peek()!='['){
                    sb.append(stack.pop());
                }
                stack.pop();
                sb.reverse();
                int num=nums.pop();
                String as=sb.toString();
                while(num>1){
                    sb.append(as);
                    num--;
                }
                num=0;
                for(int j=0;j<sb.length();j++){
                    stack.push(sb.charAt(j));
                }
                i++;
            }
            else if(Character.isDigit(s.charAt(i))){
                n=n*10+(s.charAt(i)-'0');
                i++;
            }
            else if(s.charAt(i)=='['){
                nums.push(n);
                n=0;
                stack.push('[');
                i++;
            }
            else{
                stack.push(s.charAt(i));
                i++;
            }
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty())result.append(stack.pop());
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s="3[a2[c]]";
        System.out.println(decoder(s));
    }
}
