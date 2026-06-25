public class Stack_Array {
    static class Stack{
        int arr[];
        int top=-1;
        Stack(int n){
            top=-1;
            arr=new int[n];
        }
        boolean isEmpty(){
            return top==-1;
        }
        boolean isFull(){
            return top==(arr.length-1);
        }
        void push(int d){
            if(isFull())return;
            arr[++top]=d;
        }
        int pop(){
            if(isEmpty())return -1;
            return arr[top--];
        }
        int peek(){
            if(isEmpty())return -1;
            return arr[top];
        }
        void print(){
            System.out.println("Stack elements are: ");
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(12);
        s.push(13);
        s.push(14);
        s.print();
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        s.print();

    }
}
