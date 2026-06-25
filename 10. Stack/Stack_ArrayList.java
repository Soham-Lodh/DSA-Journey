import java.util.*;
public class Stack_ArrayList {
    static class Stack{
        ArrayList<Integer> stack;
        Stack(){
            stack=new ArrayList<>();
        }
        boolean isEmpty(){
            return stack.size()==0;
        }
        void push(int data){
            stack.add(data);
        }
        int pop(){
            int d=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return d;
        }
        int peek(){
            int d=stack.get(stack.size()-1);
            return d;
        }
        void print(){
            System.out.println("Stack elements are: ");
            for(int i=stack.size()-1;i>=0;i--){
                System.out.println(stack.get(i)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(12);
        s.push(13);
        s.push(14);
        s.print();
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        s.print();
    }
}
