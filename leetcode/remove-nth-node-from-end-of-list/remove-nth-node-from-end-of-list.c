/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(!head) return NULL;
    if(head->next==NULL && n==1)return NULL;
    struct ListNode* temp1=head;
    struct ListNode* temp2=head;
    int i=0;
    while(i<n && temp1!=NULL){
        temp1=temp1->next;
        i++;
    }
    if (temp1 == NULL) {
        struct ListNode* toDelete = head;
        head = head->next;
        free(toDelete);
        return head;
    }
    while(temp1->next!=NULL){
        temp2=temp2->next;
        temp1=temp1->next;
    }
    temp1=temp2->next;
    temp2->next=temp2->next->next;
    free(temp1);
    return head;
}