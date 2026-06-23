
public class DoublyLinkedList {

    public static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public int size() {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void addFirst(int data) {
        if (size() == 0) {
            head = tail = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    public void addLast(int data) {
        if (size() == 0) {
            head = tail = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
    }

    public void addIndex(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        int count = 1;
        Node temp = head;
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        Node nk = new Node(data);
        nk.next = temp.next;
        temp.next.prev = nk;
        temp.next = nk;
        nk.prev = temp;
    }

    public int removeFirst() {
        if (size() == 0) {
            return -1;
        }
        int val = head.data;
        if (head == tail) {
            head = tail = null;
            return val;
        }
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removelast() {
        if (size() == 0) {
            return -1;
        }
        int val = tail.data;
        if (head == tail) {
            head = tail = null;
            return val;
        }
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void reverse() {
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        prev=head;
        head=tail;
        tail=prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.err.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(12);
        dl.addFirst(23);
        dl.addFirst(36);
        dl.addLast(45);
        dl.addLast(56);
        dl.addLast(67);
        dl.addIndex(78, 1);
        dl.addIndex(89, 6);
        dl.print();
        dl.reverse();
        dl.print();
    }
}
