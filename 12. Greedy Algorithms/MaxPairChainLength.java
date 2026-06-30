import java.util.*;
public class MaxPairChainLength {
    static int length(int arr[][]){
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        ArrayList<int[]>list=new ArrayList<>();
        int s=arr[0][1];
        list.add(arr[0]);
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>s){
                s=arr[i][1];
                count++;
                list.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print("("+list.get(i)[0]+","+list.get(i)[1]+")");
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println("Max Pair Chain Length: "+length(arr));
    }
}
