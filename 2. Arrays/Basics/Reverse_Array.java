import java.util.*;
public class Reverse_Array {
    //O(n)
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}