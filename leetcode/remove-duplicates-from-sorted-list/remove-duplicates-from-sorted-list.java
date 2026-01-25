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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ak=null;
        ListNode temp=null;
        while(head!=null){
            if(head.next!=null && head.val==head.next.val)head=head.next;
            else{
                ListNode nk = new ListNode(head.val);
                if(ak==null){
                    ak=nk;
                    temp=nk;
                }
                else{
                    temp.next=nk;
                    temp=temp.next;
                }   
                head=head.next;
            }
        }
        return ak;
    }
}