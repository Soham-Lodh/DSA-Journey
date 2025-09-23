struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2){
    if(!list1)return list1;
    if(!list2)return list1;
    int count=0;
    struct ListNode* temp=list1;
    struct ListNode* temp1;
    struct ListNode* temp2;
    while(temp->next!=NULL){
        if(count==(a-1)){
            temp1=temp;
        }
        else if(count==b){
            temp2=temp->next;
            break;
        }
        count+=1;
        temp=temp->next;
    }
    temp=list2;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp1->next=list2;
    temp->next=temp2;
    return list1;
}