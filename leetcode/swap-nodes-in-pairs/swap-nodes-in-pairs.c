/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if(head==NULL)return NULL;
    struct ListNode* temp=head;
    while(temp->next!=NULL){
        int ak=temp->val;
        temp->val=temp->next->val;
        temp->next->val=ak;
        if(temp->next->next!=NULL)temp=temp->next->next;
        else break;
    }
    return head;
}