public class Stack_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack {
        Node head;
        Stack() {
            head=null;
        }

        boolean isEmpty() {
            return head==null;
        }

        void push(int d) {
            Node temp=new Node(d);
            temp.next=head;
            head=temp;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            Node temp=head;
            head=head.next;
            return temp.data;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        void print() {
            System.out.println("Stack elements are: ");
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        s.print();
    }
}
