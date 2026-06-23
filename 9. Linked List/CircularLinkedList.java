public class CircularLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public int size(){
        if(head==null)return 0;
        else if(head==tail)return 1;
        Node temp=head;
        int count=0;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        return count;
    }
    public void addFirst(int data){
        if(head==null){
            head=tail=new Node(data);
            return;
        }
        Node temp=new Node(data);
        temp.next=head;
        tail.next=temp;
        head=temp;
    }
    public void addLast(int data){
        if(head==null){
            head=tail=new Node(data);
            return;
        }
        Node temp=new Node(data);
        tail.next=temp;
        temp.next=head;
        tail=temp;
    }
    public int removeFirst(){
        if(head==null){
            return -1;
        }
        Node temp=head;
        head=head.next;
        tail.next=head;
        return temp.data;
    }
    public int removeLast(){
        if(head==null){
            return -1;
        }
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        temp=temp.next;
        tail.next=head;
        return temp.data;
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.print("HEAD");
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.addFirst(1);
        cl.addFirst(2);
        cl.addLast(3);
        cl.print();
        System.out.println(cl.size());
        cl.removeFirst();
        cl.print();
        cl.removeLast();
        cl.print();
    }
}

