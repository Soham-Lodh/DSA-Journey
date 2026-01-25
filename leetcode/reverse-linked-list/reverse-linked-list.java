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
    public ListNode reverseList(ListNode head) {
        if(head!=null){
            ListNode temp=head.next;
            head.next=null;
            return reverser(head,temp);
        }
        return null;
    }
    ListNode reverser(ListNode a,ListNode b){
        if(b==null)return a;
        ListNode temp=b.next;
        b.next=a;
        return reverser(b,temp);
    }
}