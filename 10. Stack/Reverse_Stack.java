import java.util.Stack;

public class Reverse_Stack {

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty())return;
        int t=s.pop();
        reverseStack(s);
        push_bottom(s,t);
    }
    static void push_bottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int t=s.pop();
        push_bottom(s,data);
        s.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack elements are: ");
        System.out.println(s);
        reverseStack(s);
        System.out.println("Stack elements after reversing: ");
        System.out.println(s);
    }
}
