class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode nl = null;
        ListNode temp = null;
        while (head != null) {
            if (head.next != null && head.next.val == head.val){
                ListNode tempa=head.next;
                while(tempa!=null && tempa.val==head.val)tempa=tempa.next;
                head=tempa;
            }
            else{
                ListNode nk = new ListNode(head.val);
                if (nl == null) {
                    nl = nk;
                    temp = nk;
                } else {
                    temp.next = nk;
                    temp = temp.next;
                }
                head=head.next;
            }
        }
        return nl;
    }
}
