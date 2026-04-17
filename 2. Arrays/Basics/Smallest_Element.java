public class Smallest_Element {
    //O(n)
    public static int smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 325, 12443, 21432, 645};
        System.out.println("Smallest element: " + smallest(arr));
    }
}