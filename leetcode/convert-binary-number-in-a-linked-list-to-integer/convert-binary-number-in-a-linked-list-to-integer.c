/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode* temp=head->next;
    int count=0;
    while(temp!=NULL){
        count+=1;
        temp=temp->next;
    }
    int num=0;
    temp=head;
    while(count>=0 && temp!=NULL){
        num+=(temp->val*pow(2,count));
        count-=1;
        temp=temp->next;
    }
    return num;
}