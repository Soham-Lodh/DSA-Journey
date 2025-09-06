void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    if (m == 0) {
        for (int x = 0; x < n; x++) {
            nums1[x] = nums2[x];
        }
        return;
    }
    else if(nums2Size==0){
        return;
    }
    else{
        int i=0,j=0,k=0;
        int* arr=(int*)malloc((m)*(sizeof(int)));
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        while(i<m && j<n && k<nums1Size){
            if(arr[i]<=nums2[j]){
                nums1[k]=arr[i];
                i++;
                k++;
            }
            else if(arr[i]>nums2[j]){
                nums1[k]=nums2[j];
                j++;
                k++;
            }
        }
         while (i < m) {
            nums1[k++] = arr[i++];
        }
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
        free(arr);
        return;
    }
}