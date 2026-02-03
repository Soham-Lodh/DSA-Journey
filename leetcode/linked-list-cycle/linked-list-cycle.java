/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)return false;
        return checkLoop(head,head.next);
    }
    boolean checkLoop(ListNode A,ListNode B){
        if(B==null || B.next==null)return false;
        A=A.next;
        B=B.next.next;
        if(A==B)return true;
        return checkLoop(A,B);
    }
}