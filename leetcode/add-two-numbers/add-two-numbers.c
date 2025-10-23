/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* tempa=l1;
    struct ListNode* tempb=l2;
    while(tempa!=NULL){
        if(tempb!=NULL){
            tempa->val+=tempb->val;
            tempb=tempb->next;
        }
        if(tempa->val>9){
            if(tempa->next!=NULL){
                int k=tempa->val/10;
                tempa->val=tempa->val%10;
                tempa->next->val+=k;
            }
            else{
                int k=tempa->val/10;
                tempa->val=tempa->val%10;
                struct ListNode*ak=(struct ListNode*)malloc(sizeof(struct ListNode));
                ak->val=k;
                tempa->next=ak;
                ak->next=NULL;
            }
        }
        if (tempa->next == NULL && tempb != NULL) {
            tempa->next = tempb;
            tempb = NULL;
        }
        tempa = tempa->next;
    }
    return l1;
}