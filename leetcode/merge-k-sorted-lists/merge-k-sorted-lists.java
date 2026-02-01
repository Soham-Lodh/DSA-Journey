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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null;
        for(int i=0;i<lists.length;i++){
            head=mergeTwoLists(head,lists[i]);
        }
        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode temp=null;
        while(list1!=null && list2!=null){
            ListNode newNode=new ListNode();
            if(list1.val<=list2.val){
                newNode.val=list1.val;
                list1=list1.next;
            }
            else{
                newNode.val=list2.val;
                list2=list2.next;
            }
            if(head==null){
                head=newNode;
                temp=newNode;
            }
            else{
                temp.next=newNode;
                temp=temp.next;
            }

        }
        while(list1!=null){
            ListNode newNode=new ListNode();
            newNode.val=list1.val;
            list1=list1.next;
            if(head==null){
                head=newNode;
                temp=newNode;
            }
            else{
                temp.next=newNode;
                temp=temp.next;
            }
        }
        while(list2!=null){
            ListNode newNode=new ListNode();
            newNode.val=list2.val;
            list2=list2.next;
            if(head==null){
                head=newNode;
                temp=newNode;
            }
            else{
                temp.next=newNode;
                temp=temp.next;
            }
        }
        return head;
    }
}