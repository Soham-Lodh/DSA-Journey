
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    //O(1)
    public void addLast(int d) {
        if (head == null) {
            head = tail = new Node(d);
        } else {
            tail.next = new Node(d);
            tail = tail.next;
        }
    }

    //O(1)
    public void addFirst(int d) {
        if (head == null) {
            head = tail = new Node(d);
        } else {
            Node n = new Node(d);
            n.next = head;
            head = n;
        }
    }

    //O(n)
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    //O(n)
    public void addIndex(int index, int data) {
        if (index < 0) {
            System.out.println("Index can't be negative");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        } else if (head == null && index > 0) {
            System.out.println("Index out of bounds");
            return;
        } else {
            Node temp = head;
            int count = 1;
            while (temp != null) {
                if (count == index) {
                    if (temp == tail) {
                        addLast(data);
                        return;
                    }
                    Node n = new Node(data);
                    n.next = temp.next;
                    temp.next = n;
                    return;
                }
                count++;
                temp = temp.next;
            }
            System.out.println("Index out of bounds");
            return;
        }
    }

    //O(n)
    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        size = count;
        return count;
    }

    //O(1)
    public void removeFirst() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        } else if (head == tail) {
            head = tail = null;
        }
        int data = head.data;
        head = head.next;
        System.out.println("Deleted: " + data);
        return;
    }

    //O(n)
    public void removeLast() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            int data = tail.data;
            temp.next = null;
            tail = temp;
            System.out.println("Deleted: " + data);
            return;
        }
    }

    //O(n)
    public int search_itr(int data) {
        if (head == null) {
            System.out.println("Nothing to search, Linked list is empty");
            return -1;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Found at index: " + count);
                return count;
            }
            count++;
            temp = temp.next;
        }
        System.out.println("Nothing found");
        return -1;
    }

    //O(n)
    public int search_rec(int data, Node temp, int index) {
        if (temp == null) {
            System.out.println("Nothing found");
            return -1;
        } else if (temp.data == data) {
            System.out.println("Found at index: " + index);
            return index;
        } else {
            search_rec(data, temp.next, index + 1);
            return -1;
        }
    }

    //O(n)
    public void reverse_itr() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        } else if (head.next == null) {
            return;
        } else {
            Node temp = head.next;
            tail = head;
            head.next = null;
            while (temp != null) {
                Node nxt = temp.next;
                temp.next = head;
                head = temp;
                temp = nxt;
            }
            return;
        }
    }

    //O(n)
    public Node findMid() {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //O(n)
    public void removeN_end(int n) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        int sz = size();
        if (n == sz) {
            head = head.next;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < (sz - n)) {
            temp = temp.next;
            count++;
        }
        if(temp == null || temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
    }

    //O(n)
    public Node reverse(Node n) {
        if (n == null || n.next == null) {
            return n;
        }
        Node temp = n.next;
        n.next = null;
        while (temp != null) {
            Node nxt = temp.next;
            temp.next = n;
            n = temp;
            temp = nxt;
        }
        return n;
    }

    //O(n)
    public boolean pallindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid();
        Node n = reverse(mid);
        Node temp = head;
        while (temp != null && n != null) {
            if (temp.data != n.data) {
                return false;
            }
            temp = temp.next;
            n = n.next;
        }
        return true;
    }

    //O(n)
    public boolean cycle_detector() {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    //O(n)
    public void break_cycle() {
        if (head == null || head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast && slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
        return;
    }
    
    //O(nlogn)
    public Node mergeSort(Node h){
        if(h==null || h.next==null)return h;
        Node slow=h;
        Node fast=h.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        Node left = mergeSort(h);
        Node right = mergeSort(fast);
        return merge(left, right);
    }
    public static Node merge(Node l1,Node l2){
        if(l1==null)return l2;
        else if(l2==null)return l1;
        Node temp=new Node(-1);
        Node h=temp;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)temp.next=l1;
        if(l2!=null)temp.next=l2;
        return h.next;
    }
    
    //O(n)
    public Node ZigZag(Node h){
        if(h==null|| h.next==null)return h;
        Node slow=h;
        Node fast=h.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        slow=h;
        fast=reverse(fast);
        boolean flag=true;
        Node temp=new Node(-1);
        Node hk=temp;
        while(slow!=null && fast!=null){
            if(flag){
                temp.next=slow;
                slow=slow.next;
                flag=false;
            }
            else{
                temp.next=fast;
                fast=fast.next;
                flag=true;
            }
            temp=temp.next;
        }
        if(slow!=null)temp.next=slow;
        if(fast!=null)temp.next=fast;
        return hk.next;
    }
    
    //O(n)
    public void deleteMN(int m,int n){
        if(head==null)return;
        int sz=size();
        if(m+n>sz){
            return;
        }
        else if(m+n == sz){
            head=tail=null;
        }
        Node temp1=head;
        int count=1;
        while(temp1!=null && count<m){
            temp1=temp1.next;
            count++;
        }
        Node temp2=temp1;
        count=0;
        while(temp2!=null && count<n){
            temp2=temp2.next;
            count++;
        }
        if(temp2==tail){
            tail=temp1;
        }
        if(temp1!=null && temp2!=null){
            temp1.next=temp2.next;
        }
    }
    //O(n)
	public void OddEven() {
		if (head == null || head.next == null) {
			return;
		}

		Node evenHead = null;
		Node evenTail = null;
		Node oddHead = null;
		Node oddTail = null;

		Node temp = head;

		while (temp != null) {
			Node next = temp.next;
			temp.next = null;

			if (temp.data % 2 == 0) {
				if (evenHead == null) {
					evenHead = evenTail = temp;
				} else {
					evenTail.next = temp;
					evenTail = temp;
				}
			} else {
				if (oddHead == null) {
					oddHead = oddTail = temp;
				} else {
					oddTail.next = temp;
					oddTail = temp;
				}
			}

			temp = next;
		}

		if (evenHead == null) {
			head = oddHead;
			tail = oddTail;
			return;
		}

		if (oddHead == null) {
			head = evenHead;
			tail = evenTail;
			return;
		}

		evenTail.next = oddHead;
		head = evenHead;
		tail = oddTail;
	}
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(5);
        l.addFirst(4);
        l.addLast(3);
        l.addIndex(2, 10);
        l.addIndex(0, 0);
        l.addIndex(5, 11);
        l.print();
        System.out.println("Size of Linked List: " + l.size());
        l.removeFirst();
        l.print();
        l.removeLast();
        l.print();
        l.search_itr(5);
        l.search_rec(10, head, 0);
        l.print();
        l.reverse_itr();
        l.print();
        l.removeN_end(1);
        l.print();
        tail.next = head.next;
        System.out.println("Cycle present: " + l.cycle_detector());
        l.break_cycle();
        System.err.println("Cycle present: " + l.cycle_detector());
        l.print();
        l.addLast(10);
        l.addLast(3);
        l.print();
        head=l.mergeSort(head);
        l.print();
        head=l.ZigZag(head);
        l.print();
        l.OddEven();
        l.print();
        l.deleteMN(2,2);
        l.print();
        System.out.println("Pallindrome: " + l.pallindrome());
    }
}
