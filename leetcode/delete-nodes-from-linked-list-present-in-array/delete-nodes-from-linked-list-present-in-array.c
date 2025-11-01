/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* modifiedList(int* nums, int numsSize, struct ListNode* head){
    bool arr[100001]={false};
    for(int i=0;i<numsSize;i++){
        if(arr[nums[i]]==false){
            arr[nums[i]]=true;
        }
    }
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode*p=&dummy;
    while(p!=NULL&&p->next!=NULL){
        if(arr[p->next->val]==true){
            p->next=p->next->next;
        }
        else{
            p=p->next;
        }
    }
    return dummy.next;
}