public class Print_Pairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int count = 0;
        //O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                count++;
            }
            System.out.println();
        }
        //Total pairs = nC2 = n!/(n-2)!*2! = n*(n-1)/2
        System.out.println("Total pairs: " + count);
    }
}