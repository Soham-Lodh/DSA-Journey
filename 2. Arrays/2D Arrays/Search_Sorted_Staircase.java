public class Search_Sorted_Staircase {
    //O(m+n)
    static int[] search(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        int indexes[]=new int[2];
        while(row < arr.length && col >= 0){
            int val=arr[row][col];
            if(val==key){
                indexes[0]=row;
                indexes[1]=col;
                return indexes;
            }
            else if(val>key)col--;
            else if(val<key)row++;
        }
        indexes[0]=-1;
        indexes[1]=-1;
        return indexes;
    }
    public static void main(String[] args) {
        int matrix[][]={{12,23,34},{45,56,67},{78,89,90}};
        int[] result = search(matrix, 56);
        System.out.println("Row: " + result[0] + ", Column: " + result[1]);
    }
}
