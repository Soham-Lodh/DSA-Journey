import java.util.*;
public class RotateArray{
    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k );
        reverse(nums, k , nums.length);
    }
    static void reverse(int arr[], int l, int r) {
        int left = l, right = r - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}