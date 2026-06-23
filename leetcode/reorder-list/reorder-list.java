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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        slow=head;
        fast=reverse(fast);
        int flag=0;
        ListNode temp=new ListNode(-1);
        while(slow!=null && fast!=null){
            if(flag==0){
                temp.next=slow;
                slow=slow.next;
                flag=1;
            }
            else{
                temp.next=fast;
                fast=fast.next;
                flag=0;
            }
            temp=temp.next;
        }
        if(slow!=null)temp.next=slow;
        if(fast!=null)temp.next=fast;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode curr=head.next;
        head.next=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=head;
            head=curr;
            curr=next;
        }
        return head;
    }
}