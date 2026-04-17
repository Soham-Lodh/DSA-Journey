import java.util.*;
public class Print_SubArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={23,12,43,234,3,2445,623,45};
        int count=0;
        //O(n^3)
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                }
                System.out.println(" Sum: "+sum);
                count++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: "+count);
    }
}