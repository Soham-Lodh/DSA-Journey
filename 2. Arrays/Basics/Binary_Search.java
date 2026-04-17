import java.util.*;
public class Binary_Search {
    //O(log n)
    public static int binary_search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.print("Enter number to search: ");
        int n = sc.nextInt();
        int idx = binary_search(arr, n);
        if (idx < 0) System.out.println("Element not found");
        else System.out.println("Element found at index " + idx);
        sc.close();
    }
}