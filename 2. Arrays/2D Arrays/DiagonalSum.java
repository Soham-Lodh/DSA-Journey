public class DiagonalSum {
    static void diagonalSum(int arr[][]){
        if(arr.length!=arr[0].length){
            System.out.println("No diagonals");
        }
        else if(arr.length%2==0){
            int leftDiagonal=0,rightDiagonal=0;
            for(int i=0;i<arr.length;i++){
                leftDiagonal+=arr[i][i];
                rightDiagonal+=arr[i][arr.length-i-1];
            }
            System.out.println("Left Diagonal: "+leftDiagonal);
            System.out.println("Right Diagonal: "+rightDiagonal);
            System.out.println("Total sum: "+(leftDiagonal+rightDiagonal));
        }
        else{
            int leftDiagonal=0,rightDiagonal=0;
            for(int i=0;i<arr.length;i++){
                leftDiagonal+=arr[i][i];
                if(i!=arr.length-i-1){
                    rightDiagonal+=arr[i][arr.length-i-1];
                }
            }
            System.out.println("Left Diagonal: "+leftDiagonal);
            System.out.println("Right Diagonal: "+rightDiagonal);
            System.out.println("Total sum: "+(leftDiagonal+rightDiagonal));
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        diagonalSum(matrix);
    }
}
