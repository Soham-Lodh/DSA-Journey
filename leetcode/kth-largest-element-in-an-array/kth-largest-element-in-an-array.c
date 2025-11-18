int* quick(int arr[], int low, int high) {
    if (low < high) {
        int i = low;
        int j = high;
        int pivot = arr[(low + high) / 2];

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quick(arr, low, j);
        if (i < high) quick(arr, i, high);
    }
    return arr;
}

int findKthLargest(int* nums, int numsSize, int k) {
    quick(nums, 0, numsSize - 1);
    return nums[numsSize - k];
}
