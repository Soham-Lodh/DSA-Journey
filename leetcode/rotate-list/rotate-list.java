/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        k=k%len;
        while(k!=0){
            temp=head;
            while(temp.next.next!=null)temp=temp.next;
            ListNode temp1=temp.next;
            temp1.next=head;
            temp.next=null;
            head=temp1;
            k--;
        }
        return head;
    }
}