/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    while (head != NULL && head->val == val) {
        struct ListNode* temp = head;
        head = head->next;
        free(temp);
    }
    struct ListNode* temp=head;
    while(temp!=NULL && temp->next!=NULL){
        if(temp->next->val==val && temp->next->next==NULL){
            struct ListNode* ak=temp->next;
            temp->next=NULL;
            free(ak);
        }
        else if(temp->next->val==val){
            struct ListNode* ak=temp->next;
            temp->next=temp->next->next;
            ak->next=NULL;
            free(ak);
        }
        else{temp=temp->next;}
        
    }
    return head;
}