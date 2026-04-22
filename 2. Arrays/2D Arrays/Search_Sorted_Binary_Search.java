public class Search_Sorted_Binary_Search {
    //O(log(m)+log(n))
    static int[] search_sorted(int arr[][],int key){
        int startIdx=0;
        int endIdx=arr.length-1;
        while(startIdx<=endIdx){
            int mid=startIdx+(endIdx-startIdx)/2;
            if(arr[mid][0]>key)endIdx=mid-1;
            else if(arr[mid][0]<key && arr[mid][arr[0].length-1]<key)startIdx=mid+1;
            else if(arr[mid][0]<=key && arr[mid][arr[0].length-1]>=key){
                int start=0;
                int end=arr[0].length-1;
                while(start<=end){
                    int middle=start+(end-start)/2;
                    if(arr[mid][middle]==key){
                        int indexes[]=new int[2];
                        indexes[0]=mid;
                        indexes[1]=middle;
                        return indexes;
                    }
                    else if(arr[mid][middle]<key)start=middle+1;
                    else end=middle-1;
                }
            }
        }
        int indexes[]=new int[2];
        indexes[0]=-1;
        indexes[1]=-1;
        return indexes;
    }
    public static void main(String[] args) {
        int matrix[][]={{12,23,34},{45,56,67},{78,89,90}};
        int[] result = search_sorted(matrix, 56);
        System.out.println("Row: " + result[0] + ", Column: " + result[1]);
    }
}
