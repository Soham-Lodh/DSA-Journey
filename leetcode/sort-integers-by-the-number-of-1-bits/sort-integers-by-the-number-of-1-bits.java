class Solution {
    public int[] sortByBits(int[] arr) {
        int nums[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.bitCount(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (nums[j] < nums[min_index] || 
                   (nums[j] == nums[min_index] && arr[j] < arr[min_index])) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
            int temp2 = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp2;
        }

        return arr;
    }
}