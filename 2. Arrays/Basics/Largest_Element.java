public class Largest_Element {
    //O(n)
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 325, 12443, 21432, 645};
        System.out.println("Largest element: " + largest(arr));
    }
}