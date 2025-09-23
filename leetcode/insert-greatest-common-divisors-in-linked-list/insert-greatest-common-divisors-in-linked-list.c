/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
 int compare(int a,int b){
    if(a<=b)return a;
    return b;
 }
struct ListNode* insertGreatestCommonDivisors(struct ListNode* head) {
    if(!head) return head;
    if(head->next==NULL) return head;
    if(head->next->next==NULL){
        int g=gcd(head->val,head->next->val);
            struct ListNode* newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
            newNode->val=g;
            newNode->next=head->next;
            head->next=newNode;
        return head;
    }
    struct ListNode* temp=head;
    while(temp->next!=NULL && temp!=NULL){
        int g=gcd(temp->val,temp->next->val);
            struct ListNode* newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
            newNode->val=g;
            newNode->next=temp->next;
            temp->next=newNode;
            temp=temp->next->next;
    }
    return head;
}