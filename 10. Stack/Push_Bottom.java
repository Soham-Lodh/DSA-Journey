import java.util.*;
public class Push_Bottom {
    static void push_bottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int t=s.pop();
        push_bottom(s,data);
        s.push(t);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack elements are: ");
        System.out.println(s);
        push_bottom(s,5);
        System.out.println("Stack elements after pushing at bottom: ");
        System.out.println(s);
    }
}
