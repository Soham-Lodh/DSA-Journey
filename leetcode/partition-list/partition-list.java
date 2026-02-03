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
    public ListNode partition(ListNode heada, int x) {
        ListNode head=null;
        ListNode temp=null;
        ListNode temp2=heada;
        while(temp2!=null){
            if(temp2.val<x){
                ListNode newNode=new ListNode();
                newNode.val=temp2.val;
                if(head==null){
                    head=newNode;
                    temp=newNode;
                }
                else{
                    temp.next=newNode;
                    temp=temp.next;
                }
            }
            temp2=temp2.next;
        }
        temp2=heada;
        while(temp2!=null){
            if(temp2.val>=x){
                ListNode newNode=new ListNode();
                newNode.val=temp2.val;
                if(head==null){
                    head=newNode;
                    temp=newNode;
                }
                else{
                    temp.next=newNode;
                    temp=temp.next;
                }
            }
            temp2=temp2.next;
        }
        return head;
    }
}