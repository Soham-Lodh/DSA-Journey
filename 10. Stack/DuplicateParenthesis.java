import java.util.*;
public class DuplicateParenthesis {
    static boolean verify(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(stack.isEmpty())return true;
                else if(stack.peek()=='(')return true;
                while(stack.peek()!='(')stack.pop();
                stack.pop();
            }else stack.push(s.charAt(i));
        }
        return false;
    }
    public static void main(String[] args) {
        String s="((a+b))";
        String s1="(a+b)";
        System.out.println(verify(s1));
        System.out.println(verify(s));
    }
}
